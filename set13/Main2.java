
public class Main2{
    public static int[] clock(int[] clocks){
        int totalhours = 0;
        int highesthour = clocks[0];

        for( int hour : clocks){
            totalhours += hour;
            if(hour>highesthour) highesthour = hour;
        }
        return new int[]{totalhours , highesthour};
    }
    public static void main(String[] args){
int[] result = clock(new int[]{3,8,9,10});
System.out.println("(" + result[0] + " , " + result[1] + ") ");
    }
} 