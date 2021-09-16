package modern;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsVersion {
    public static void main(String[] args) {
        //Random n from 1 to 10^5
        int n = (int) (Math.random() * (Math.pow(10, 5)) + 1);
        System.out.println(" n = " + n);

        //Random k from 1 to n
        int k = (int) (Math.random() * (n) + 1);
        System.out.println(" k = " + k);

        //Parking Length
        int parkingLength = (int) (Math.random() * (Math.pow(10, 14)) + 1);
        System.out.println("Parking length = " + parkingLength);

        //Generating ParkedCars (unique)
        ArrayList<Integer> cars = generatingParkedCars(parkingLength, n);
        System.out.print("cars = [ ");
        cars.forEach(i -> System.out.print(i + " "));
        System.out.println(" ] ");

        int answer = SolutionModern.carParkingRoof(cars, k);
        System.out.println("\nThe min length is " + answer);
    }

    private static ArrayList<Integer> generatingParkedCars(int parkingLength, int length) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() != length) {
            set.add((int) (Math.random() * (parkingLength) + 1));
        }
        return new ArrayList<>(set);
    }
}
