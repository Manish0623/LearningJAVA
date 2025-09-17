public class pyramidStar {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 1; i <= row; i++) {
          
            for (int j = i; j < row; j++) {
                System.out.print("  ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }

           
            System.out.println();
        }
    }
}
