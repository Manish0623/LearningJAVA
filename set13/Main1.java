public class Main1{
    public static int[] Hoard(int[] treasure){
        int totalValue = 0;
        int highestValue = treasure[0];

        for( int value: treasure){
            totalValue+=value;
            if(value>highestValue) highestValue = value;
        }
        return new int[]{highestValue , totalValue};
    }
    public static void main(String[] args) {
        int[] result = Hoard(new int[]{2000,3000,100,300});
        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }}
