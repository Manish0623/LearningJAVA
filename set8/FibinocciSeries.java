

import java.util.Scanner;

public class FibinocciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println(" Enter the nth terms: ");
int n = sc.nextInt();


int first = 0; 
int second = 1 ;

System.out.println(" The fibinocci series for" +  n + " terms : ");


for (int i = 0; i < n; i++) {
    System.out.print( first + " ");


    int next = first + second ;
    first = second;
    second = next;
    
}

sc.close();
}

    }
