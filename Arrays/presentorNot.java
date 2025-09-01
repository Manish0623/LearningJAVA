import java.util.Scanner;
public class presentorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numbers[] = {90,40,50,32,45};


        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for(int number:numbers) {
            if(number == num) {
             found = true ;
             break;

            }
        }
        if(found){
            System.out.println(num+ " is present in the array ");
        }
        else{
            System.out.println(num + " is not present in the array");
        }
    }



}
