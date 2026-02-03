
import java.util.ArrayList;

class sortArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(1);
        list.add(12);
        list.add(9);
        list.add(6);

        System.out.println("Before Sorting: " + list);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {

                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));   // correct way to replace
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("After Sorting: " + list);
    }
}
