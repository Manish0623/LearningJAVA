public class reverseStar {
    public static void main(String[] args) {
        int row = 6;

        for (int i = row; i >= 1; i--) {
            // Print spaces that increase each row
            for (int j = 0; j < row - i; j++) {
                System.out.print("  ");  // double space for alignment
            }

            // Print stars that decrease each row
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }

            // Move to next line
            System.out.println( );
        }
    }
}
