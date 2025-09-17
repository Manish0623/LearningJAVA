public class PascalTriangle {

    public static void main(String[] args) {

        int row = 6;

        for (int i = 0; i < row; i++) {
            // Print leading spaces
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                // Calculate next binomial coefficient
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

