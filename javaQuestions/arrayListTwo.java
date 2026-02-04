
import java.util.ArrayList;
class arrayListTwo{
    public static void main(String[] args){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(12);
    list.add(7);
    list.add(11);
    list.add(19);
    list.add(4);
System.out.print(list + " ");

int evenCount = 0;
int oddcount = 0;

for( int i=  0 ; i<list.size() ; i++){
    if(list.get(i) % 2 ==0){
        evenCount++;
    } else{
        oddcount++;
    }
}
System.out.print(" \nno of even numbers: " + evenCount);
System.out.print(" \nno of odd numbers: " + oddcount);
    }
}