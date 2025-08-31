import java.util.Scanner;
public class sumofmultiplicationTable {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int sum = 0;

System.out.println("Enter a number: ");
int number  = sc.nextInt();

for(int i=1;i<=number;i++){
int multiply = (i * number);
System.out.println(number + " x " + i + " = " + multiply);
sum +=  multiply;
}

System.out.println(" the sum of the multiplication sum : " + sum );

sc.close();
    }

}
