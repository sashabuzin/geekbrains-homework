package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class arrayTestTest {

    private final ArrayTest arrayTest= new ArrayTest();

    @ParameterizedTest
    @MethodSource("dataValuesForAfterLastFour")
    void arrayAfterLastFour(int[] origArray, int[] expectedArray) {
        int[] actualResultArray = arrayTest.arrayAfterLastFour(origArray);

        Assertions.assertArrayEquals(expectedArray, actualResultArray);

    }

    private static Stream<Arguments> dataValuesForAfterLastFour () {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{ 1, 2, 3, 4, 5 }, new int[]{ 5 }));
            add(Arguments.arguments(new int[]{ 1, 2, 3, 4 }, new int[]{  }));
            add(Arguments.arguments(new int[]{ 4, 1, 2, 4, 3, 4, 5 }, new int[]{ 5 }));
            add(Arguments.arguments(new int[]{ 4, 1, 2, 3, 5 }, new int[]{ 1, 2, 3, 5 }));

        }};
        return  arguments.stream();

    }

    @Test
    void getValuesAfterLastFourWaitException() {
        int[] origArray = {1,2,3};
        Assertions.assertThrows(RuntimeException.class, () -> arrayTest.arrayAfterLastFour(origArray));

        int[] empty = {};
        Assertions.assertThrows(RuntimeException.class, () -> arrayTest.arrayAfterLastFour(empty));

    }


    @ParameterizedTest
    @MethodSource("dataForFindFourOrOneNumberInArray")
    void includesOneAndFour(int[] array, boolean expectedResult) {
        boolean actualResult = arrayTest.includesOneAndFour(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> dataForFindFourOrOneNumberInArray() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{ 1, 1, 1, 4, 4, 1, 4, 4 }, true));
            add(Arguments.arguments(new int[]{ 1, 1, 1, 1, 1, 1 }, false));
            add(Arguments.arguments(new int[]{ 4, 4, 4, 4 }, false));
            add(Arguments.arguments(new int[]{ 1, 1, 1, 4, 4, 1, 4, 2 }, false));
        }};

        return arguments.stream();

    }

}
