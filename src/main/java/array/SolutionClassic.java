package array;

import java.util.Arrays;

public class SolutionClassic {
    public static int carParkingRoof(int[] cars, int k) {
        int[] solution = new int[cars.length];
        sortArray(cars);
        for (int i = 0; i < cars.length; i++) {
            if ((i + k - 1) < cars.length) {
                int[] temp = Arrays.copyOfRange(cars, i, i + k);
                solution[i] = max(temp) - min(temp) + 1;
            }
        }
        return min(solution);
    }

    private static int max(int[] array) {
        int maximum = array[0];   // start with the first value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum && array[i] != 0) {
                maximum = array[i];   // new maximum
            }
        }
        return maximum;
    }

    private static int min(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum && array[i] != 0) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    private static void sortArray(int[] cars) {
        {
            for (int i = 1; i < cars.length; i++) {
                int j = i;
                int temp = cars[i];
                while ((j > 0) && (cars[j - 1] > temp)) {
                    cars[j] = cars[j - 1];
                    j--;
                }
                cars[j] = temp;
            }
        }
    }
}
