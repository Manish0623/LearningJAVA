



import java.util.Scanner;
public class fibinocciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
System.out.println(" Enter a number : ");
int number =  sc.nextInt();
int a = 0 , b = 1 ;
System.out.println(" fibinocci Series :");
for ( int i= 0 ; i<=number ; i++){
System.out.print( a + " ");
int next = a+b ;
a = b ;
b=  next;
}
sc.close();
    }}
