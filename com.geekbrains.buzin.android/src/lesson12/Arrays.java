package lesson12;

public class Arrays{
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    private float[] arr = new float[SIZE];

    public Arrays() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public void firstMethod () {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public void secondMethod () {
        long a = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            float[] tempArr1 = new float[arr.length / 2];
            System.arraycopy(arr, 0, tempArr1, 0,  HALF);
            for (int i = 0; i < tempArr1.length; i++) {
                tempArr1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(tempArr1, 0, arr, 0, tempArr1.length);

        });

        Thread thread2 = new Thread(() -> {
            float[] tempArr2 = new float[arr.length / 2];
            System.arraycopy(arr, HALF, tempArr2, 0,  HALF);
            for (int i = 0; i < tempArr2.length; i++) {
                tempArr2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(tempArr2, 0, arr, HALF, tempArr2.length);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - a);
    }



}
