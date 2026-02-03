

import java.util.ArrayList;
class arrayListone{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

System.out.print(list + " ");
        int  sum = 0;
        for(int i = 0 ; i<list.size() ; i++){
            sum = sum + list.get(i);
        }
        System.out.print("\n" + sum);
    }}
