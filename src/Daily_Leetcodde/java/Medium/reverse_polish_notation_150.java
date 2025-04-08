package Daily_Leetcodde.java.Medium;

public class reverse_polish_notation_150 {
    // Check if the given token is an operator
    static boolean check(String[] str, int z) {
        return str[z].equals("+") || str[z].equals("-") || str[z].equals("*") || str[z].equals("/");
    }

    // Calculate the result based on the operator
    static int cal(int x, int y, int z, String[] str) {
        int num1 = Integer.parseInt(str[x]);
        int num2 = Integer.parseInt(str[y]);

        switch (str[z]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    // Helper method to remove processed elements and add the result back to the array
    static String[] newstr(String[] str, int j, int result) {
        String[] newstr = new String[str.length - 2];
        int p = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == j - 2) {
                newstr[p++] = String.valueOf(result); // Place result at the position of the operator
            } else if (i == j - 1 || i == j) {
                continue; // Skip the two operands and operator
            } else {
                newstr[p++] = str[i];
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        String[] str = {"2","1","+","3","*"};
        while (str.length > 1) {
            for (int j = 2; j < str.length; j++) {
                if (check(str, j)) {
                    // Perform calculation and update the array
                    int result = cal(j - 2, j - 1, j, str);
                    str = newstr(str, j, result);
                    break; // Restart the loop after updating the array
                }
            }
        }
        System.out.println("Result: " + str[0]); // The final result
    }
}
