import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt user for the array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Accept each array element from the user
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Prompt user to enter a Target Sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // 4. Use Brute Force (Nested Loop) to search for a matching pair
        boolean pairFound = false;

        System.out.println("\n--- Searching for Pairs ---");
        
        // Outer loop selects the first element
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop selects the second element (starts at i + 1 to avoid duplicating pairs)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // 5. If a pair is found, display indices, values, and the equation
                    System.out.println("Pair Found!");
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    System.out.println("Values : " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    pairFound = true;
                    break; 
                }
            }
            if (pairFound) {
                break;
            }
        }

        // 6. If no pair exists, print an appropriate message
        if (!pairFound) {
            System.out.println("No unique pair exists in the array whose sum equals " + target + ".");
        }
    
        scanner.close();
    }
}