public class MajorityElement {
    public int majority(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] arr = {2, 2, 1, 3, 4, 2, 2};
        System.out.println("Majority Element: " + me.majority(arr));
    }
}
