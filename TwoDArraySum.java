import java.util.Scanner;

public class TwoDArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Declare the 2D array
        int[][] arr = new int[numRows][numCols];

        // Input elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display the sum of elements for each row
        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < numCols; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of elements in row " + (i + 1) + ": " + rowSum);
        }

        // Calculate and display the sum of elements for each column
        for (int j = 0; j < numCols; j++) {
            int colSum = 0;
            for (int i = 0; i < numRows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of elements in column " + (j + 1) + ": " + colSum);
        }

        // Display all elements of the array
        System.out.println("All elements of the array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
