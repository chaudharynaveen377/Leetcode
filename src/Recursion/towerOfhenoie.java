package Recursion;


    public class towerOfhenoie {

        // Recursive function to solve Tower of Hanoi
        public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
            // Base case
            if (n == 1) {
                System.out.println("Move disk 1 from " + source + " to " + destination);
                return;
            }
            towerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n - 1, auxiliary, destination, source);
        }

        public static void main(String[] args) {
            int n = 1; // Number of disks
            towerOfHanoi(n, 'A', 'C', 'B');  // A is the source, C is the destination, B is the auxiliary
        }


}
