// public class pattern{
//     public static void main(String[] args){
//         int row = 4;

//         for(int i=row;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class Pattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
