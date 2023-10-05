public class ArraySumExample {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {2, 4, 6, 8, 10};
        
        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Print all elements and the sum
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all elements: " + sum);
    }
}
