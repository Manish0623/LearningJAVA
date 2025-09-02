package methods;

public class third {
    static void change( int [] arr){
        arr[0] = 10;
    }

    public static void main(String[] args){
int[] marks = {90,40,50,40,50};
change(marks);
for (int mark : marks){
    System.out.print( mark + "  ");
}

    }
}
