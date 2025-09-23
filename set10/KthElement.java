


import java.util.PriorityQueue;

public class KthElement {
    public int kthElement(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthElement ke = new KthElement();

        int[] arr = {3, 2, 4, 4, 65, 4};
        int k = 4;

        System.out.println("Kth Element is: " + ke.kthElement(arr, k));
    }
}
