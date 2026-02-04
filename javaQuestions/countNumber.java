
import java.util.ArrayList;
class countNumber{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(4);
        list.add(21);
        list.add(4);
        list.add(9);
        list.add(4);

        System.out.print(list + " ");
        int count = 0 ; 
        int target = 4;
        for( int i= 0 ;i<list.size() ; i++){
            if(list.get(i) == target){
                count++;
            }
        }
        System.out.print("\n" + count);
    }}