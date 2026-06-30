import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // 5. Display the results in a professional format
        System.out.println("\n--- Results ---");
        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index : " + maxIndex);

        scanner.close();
    }
}