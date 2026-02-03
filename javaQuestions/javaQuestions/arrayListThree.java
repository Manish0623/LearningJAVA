

import java.util.ArrayList;

class arrayListthree{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(15);
list.add(35);
list.add(40);
list.add(11);
list.add(30);

System.out.print(list + " ");

int max = 0 ;

for( int i = 0; i<list.size() ; i++){
    if(list.get(i) > list.get(max)){
        max = i;
    }
}
System.out.print(" the max value is:" + list.get(max));
    }}
