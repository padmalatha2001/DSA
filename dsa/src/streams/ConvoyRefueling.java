package streams;

import java.util.Scanner;

public class ConvoyRefueling {

    public static int minRefuelings(int distance, int numberOfVehicles, int[] fuelCapacities) {
        int maxRefuelings = 0;

        for (int capacity : fuelCapacities) {
            int refuelings = (int) Math.ceil((double) distance / capacity) - 1;
            if (refuelings > maxRefuelings) {
                maxRefuelings = refuelings;
            }
        }

        return maxRefuelings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int numberOfVehicles = scanner.nextInt();
        int[] fuelCapacities = new int[numberOfVehicles];
        
        for (int i = 0; i < numberOfVehicles; i++) {
            fuelCapacities[i] = scanner.nextInt();
        }

        System.out.println(minRefuelings(distance, numberOfVehicles, fuelCapacities));

        scanner.close();
    }
}