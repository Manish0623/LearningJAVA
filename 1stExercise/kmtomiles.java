import java.util.Scanner;

public class kmtomiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers:");
double km = sc.nextDouble();
double miles = km * 0.6213;
System.out.println("The distance in miles is : " + miles);

    }
}