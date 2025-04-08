package CODEVITA;

import java.util.*;
import java.util.*;

//package CODEVITA;

import java.util.*;

public class FourteenSegmentDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for grid input (9 rows of binary data)
        System.out.println("Enter the 9 rows of the grid (each row should have the same number of columns):");
        String[] grid = new String[9];
        for (int i = 0; i < 9; i++) {
            grid[i] = scanner.nextLine().trim(); // Read each row
        }


        int charWidth = 5;

        // Create the letter map for all 26 alphabets
        HashMap<String, Character> letterMap = new HashMap<>();
        populateLetterMap(letterMap);

        // Decode the input grid and print the result
        System.out.println("Decoded Result: " + decodeGrid(grid, charWidth, letterMap));

        scanner.close();
    }

    // Helper method to populate the HashMap with all alphabet grids
    private static void populateLetterMap(HashMap<String, Character> letterMap) {
        // Add entries for all 26 letters (A-Z)
        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10001",
                "10001",
                "10001",
                "11111",
                "10001",
                "10001",
                "10001",
                "10001"
        }), 'A');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10001",
                "10001",
                "11111",
                "10001",
                "10001",
                "10001",
                "10001",
                "11111"
        }), 'B');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10000",
                "10000",
                "10000",
                "10000",
                "10000",
                "10000",
                "10000",
                "11111"
        }), 'C');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10001",
                "10001",
                "10001",
                "10001",
                "10001",
                "10001",
                "10001",
                "11111"
        }), 'D');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10000",
                "10000",
                "11111",
                "10000",
                "10000",
                "10000",
                "10000",
                "11111"
        }), 'E');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10000",
                "10000",
                "10000",
                "11111",
                "10000",
                "10000",
                "10000",
                "10000"
        }), 'F');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "10000",
                "10000",
                "10000",
                "10111",
                "10001",
                "10001",
                "10001",
                "11111"
        }), 'G');

        letterMap.put(encodeGrid(new String[]{
                "10001",
                "10001",
                "10001",
                "10001",
                "11111",
                "10001",
                "10001",
                "10001",
                "10001"
        }), 'H');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "00100",
                "00100",
                "00100", "00100", "00100", "00100", "00100", "11111"
        }), 'I');

        letterMap.put(encodeGrid(new String[]{
                "11111",
                "00001",
                "00001",
                "00001",
                "10001",
                "10001",
                "10001",
                "10001",
                "11111"
        }), 'J');

        letterMap.put(encodeGrid(new String[]{
                "10001",
                "10010",
                "10100",
                "11000",
                "11111",
                "10001",
                "10001",
                "10001",
                "10001"
        }), 'K');

        letterMap.put(encodeGrid(new String[]{
                "10000", "10000", "10000", "10000", "10000", "10000", "10000", "10000", "11111"
        }), 'L');

        letterMap.put(encodeGrid(new String[]{
                "11111", "10101", "10101", "10101", "10101", "10001", "10001", "10001", "10001"
        }), 'M');

        letterMap.put(encodeGrid(new String[]{
                "10001", "11001", "10101", "10011", "10001", "10001", "10001", "10001", "10001"
        }), 'N');

        letterMap.put(encodeGrid(new String[]{
                "01110", "10001", "10001", "10001", "10001", "10001", "10001", "10001", "01110"
        }), 'O');

        letterMap.put(encodeGrid(new String[]{
                "11111", "10001", "10001", "10001", "11111", "10000", "10000", "10000", "10000"
        }), 'P');

        letterMap.put(encodeGrid(new String[]{
                "11111", "10001", "10001", "10001", "10101", "10001", "10011", "10001", "11111"
        }), 'Q');

        letterMap.put(encodeGrid(new String[]{
                "11111", "10001", "10001", "10001", "11111", "11000", "10100", "10010", "10001"
        }), 'R');

        letterMap.put(encodeGrid(new String[]{
                "11111", "10000", "10000", "10000", "11111", "00001", "00001", "00001", "11111"
        }), 'S');

        letterMap.put(encodeGrid(new String[]{
                "11111", "00100", "00100", "00100", "00100", "00100", "00100", "00100", "00100"
        }), 'T');

        letterMap.put(encodeGrid(new String[]{
                "10001", "10001", "10001", "10001", "10001", "10001", "10001", "10001", "11111"
        }), 'U');

        letterMap.put(encodeGrid(new String[]{
                "10001", "10001", "10001", "10001", "10001", "10001", "10001", "01010", "00100"
        }), 'V');

        letterMap.put(encodeGrid(new String[]{
                "10001", "10001", "10001", "10001", "10101", "10101", "10101", "10101", "11111"
        }), 'W');

        letterMap.put(encodeGrid(new String[]{
                "10001", "00000", "01010", "00000", "00100", "00000", "01010", "00000", "10001"
        }), 'X');

        letterMap.put(encodeGrid(new String[]{
                "10001", "10001", "10001", "10001", "11111", "00001", "00001", "00001", "11111"
        }), 'Y');

        letterMap.put(encodeGrid(new String[]{
                "11111", "00000", "00010", "00000", "00100", "00000", "01000", "00000", "11111"
        }), 'Z');
    }

    // Helper method to encode a grid to a single string for easy comparison
    private static String encodeGrid(String[] grid) {
        StringBuilder sb = new StringBuilder();
        for (String row : grid) {
            sb.append(row);
        }
        return sb.toString();
    }

    // Method to decode the input grid using the letter map
    private static String decodeGrid(String[] grid, int charWidth, HashMap<String, Character> letterMap) {
        int cols = grid[0].length(); // Total columns in the input grid
        StringBuilder result = new StringBuilder();
        int col = 0;

        while (col < cols) {
            // Skip padding columns filled with zeros
            boolean isPadding = true;
            for (String row : grid) {
                if (row.charAt(col) != '0') {
                    isPadding = false;
                    break;
                }
            }
            if (isPadding) {
                col++;
                continue;
            }

            // Extract a 9x<character width> sub-grid and encode it
            if (col + charWidth <= cols) {
                String[] subGrid = new String[9];
                for (int i = 0; i < 9; i++) {
                    subGrid[i] = grid[i].substring(col, col + charWidth);
                }

                String encodedGrid = encodeGrid(subGrid);
                result.append(letterMap.getOrDefault(encodedGrid, '?')); // Match the encoded grid with predefined letters
                col += charWidth; // Move to the next character
            } else {
                break;
            }
        }

        return result.toString();
    }
}


