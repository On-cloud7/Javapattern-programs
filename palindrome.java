public class palindrome {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <= n; i++) {
            // inner loop to print the spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
