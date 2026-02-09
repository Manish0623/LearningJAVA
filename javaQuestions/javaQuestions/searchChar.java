

import java.util.Scanner;

class searchChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = {'a','b','c','d','e','f','g' ,'e','e'};
        System.out.print("Enter the target character: ");
        char target = sc.next().charAt(0);
int count = 0;
        boolean found = false;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == target) {
                  count++;
                found = true;
              
            
            }
        }

        if (found) {
            System.out.println("It is present.");
        } else {
            System.out.println("Not present.");
        }
        System.out.print(count);
    }
}

