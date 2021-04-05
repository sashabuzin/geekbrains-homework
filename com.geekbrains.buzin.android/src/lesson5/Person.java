package lesson5;

    public class Person {
        private String fullName;
        private String position;
        private String email;
        private String telephone;
        private double salary;
        int age;

        Person(String fullName, String position, String email, String telephone, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        void printInformationAboutPerson() {
            System.out.println("ФИО: " + this.fullName);
            System.out.println("Должность: " + this.position);
            System.out.println("email: " + this.email);
            System.out.println("Телефон: "+ this.telephone);
            System.out.println("Зарплата: " + this.salary + "руб.");
            System.out.println("Возраст: " + this.age);
            System.out.println();
        }
    }

