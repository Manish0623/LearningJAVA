public class first{
    static int add( int x , int y){
        int z = 0;
        if(x>y){
            z= x+y;
        }
        else if(x<y){
            z= (x+y) + 10;

        }
      else if(x == y){
            z = x-y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 19;
        int c;
        c= add(a,b);
        int a1 = 5;
        int b1 = 5;
        int c1;
        c1 = add(a1,b1);

System.out.println(c);
System.out.println(c1);
    }
}

