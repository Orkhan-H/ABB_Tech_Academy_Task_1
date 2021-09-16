package array;

import java.util.Arrays;

public class ClassicVersion {
    public static void main(String[] args) {
        //Random n from 1 to 10^5
        int n = (int) (Math.random() * (Math.pow(10, 5)) + 1);
        System.out.println(" n = " + n);

        //Random k from 1 to n
        int k = (int) (Math.random() * (n) + 1);
        System.out.println(" k = " + k);

        //Parking Size
        int parkingLength = (int) (Math.random() * (Math.pow(10, 14)) + 1);
        System.out.println("parking length = " + parkingLength);

        //Generating ParkedCars (unique and sorted)
        int[] cars = generatingParkedCars(parkingLength, n);
        System.out.print("cars = [ ");
        Arrays.stream(cars).forEach(i -> System.out.print(i + " "));
        System.out.println(" ] ");

        //Solution (in another class)
        int answer = SolutionClassic.carParkingRoof(cars, k);
        System.out.println("The min length is " + answer);
    }

    private static int[] generatingParkedCars(int parkingLength, int length) {
        int[] cars = new int[length];
        for (int i = 0; i < length; i++) {
            cars[i] = (int) (Math.random() * (parkingLength - 1) + 1);
            for (int j = 0; j <= i; j++) {
                if (cars[i] == cars[j]) {
                    cars[j] = (int) (Math.random() * (parkingLength - 1) + 1);
                }
            }
        }
        return cars;
    }
}
