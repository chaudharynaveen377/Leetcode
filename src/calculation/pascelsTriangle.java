package calculation;

import java.util.Scanner;

public class pascelsTriangle {

// A method that prints Pascal's triangle using binomial expansion
        public static void printPascal(int rows) {
            // Loop through each row from 0 to rows - 1
            for (int i = 0; i < rows; i++) {
                // Initialize the first value as 1
                int value = 1;
                // Print spaces to align the triangle
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                // Loop through each element in the row from 0 to i
                for (int k = 0; k <= i; k++) {
                    // Print the value
                    System.out.print(value + " ");
                    // Update the value using the formula k = k * (n - i) / i
                    value = value * (i - k) / (k + 1);
                }
                // Move to the next line
                System.out.println();
            }
        }

// A main method to test the code
        public static void main(String[] args) {
            // Print Pascal's triangle with 5 rows
            printPascal(5);
        }

    }

