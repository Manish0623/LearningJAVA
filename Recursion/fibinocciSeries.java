
import java.util.Scanner;
public class fibinocciSeries {
    static int fibinocci(int n){

        if ( n== 0)   return 0;
        if ( n== 1) return 1;
        
        return fibinocci(n-1) + fibinocci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number series");
        int num= sc.nextInt();

System.out.println("the fibinocci series of " + num);

for (int i=0;i<num;i++){
System.out.println(fibinocci(i) + " ");
}
    }}

