

import java.util.Scanner;

public class GCDandLcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println(" Enter the two Numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();


int gcd = findGCD(a,b);
int lcm = (a*b)/gcd;

System.out.println(" GCD of " + a + " and " + b + " is :" + gcd);
System.out.println(" LCM of " + a + " and " + b + " is :" + lcm);


sc.close();
    }
public static int findGCD( int a , int b){
while( b!=0){
    int temp = b ;
    b = b % a ;
    a = temp;
}
return a ;
}

    }
