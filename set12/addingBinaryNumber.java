


import java.util.Scanner;

public class addingBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = sc.nextLine();

     
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

  
        int sum = num1 + num2;

     
        String binarySum = Integer.toBinaryString(sum);

        // Output the result
        System.out.println("The sum of the two binary numbers is: " + binarySum);

        sc.close();
    }
}

