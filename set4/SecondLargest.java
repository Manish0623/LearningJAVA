


public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 21, 31, 10, 43, 9};

        if (arr.length < 2) {
            System.out.println("The array must have more than 2 elements");
            return; // exit if not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
System.out.println("There is no second largest element (all elements might be the same)");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
