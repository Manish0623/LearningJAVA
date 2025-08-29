import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;


        float cgpa = sum/3.f;

        System.out.println("The sum of the three numbers:" + sum);
        System.out.println("The cgpa is :" + cgpa);

    }
}
