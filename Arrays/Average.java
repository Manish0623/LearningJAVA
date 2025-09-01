import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int marks[] = {100,50,30,50};
        for(int mark:marks ){
           sum+=mark;
          
    }
     System.out.println("The total marks is : " + sum);
    System.out.println("Enter the number of student:");
    int total=sc.nextInt();

    float average = sum/total;
    System.out.println("The average marks of entered students :" + average);

        }
       
}
