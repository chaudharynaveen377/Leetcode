package A_Copilot;

public class Permutations {
    // Recursive function to generate permutations
    private static void permute(String str, int l, int r) {
        System.out.println(l);
        if (l == r) {
            System.out.println(str);
            return;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // backtrack
            }
        }

    }

    // Function to swap characters at position i and j in a string
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "AB";
        int n = str.length();
        permute(str, 0, n - 1);
//        System.out.println(swap("abc",0,2));
    }
}
