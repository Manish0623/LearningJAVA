//package PracticeSet;
import java.util.Scanner;
public class FindingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] arr = {10,20,30,40,50,60};

System.out.println("Enter a element :");
int a  = sc.nextInt();

boolean found = false;


for (int i= 0; i<arr.length ; i++){
    if (arr[i] ==a){
        System.out.println(" Element " + a + " is present in :" + i);
        found = true;
        break;
    }

}


    if(!found){
        System.out.println("Element " + a + " is not present  ");
    }

    sc.close();
    }}

