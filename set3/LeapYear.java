package set3;


import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


System.out.println(" Enter a year : ");
int year = sc.nextInt();


if( (year % 400 == 0) || (year % 4 == 0  && year % 100 != 0) ){
    System.out.println(" The given year is leap year. ");
}
else{
    System.out.println(" it is not a leap year. ");
}


    }}


