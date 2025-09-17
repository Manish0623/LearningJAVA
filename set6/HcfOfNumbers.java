public class HcfOfNumbers{
    static int Hcf(int a , int b){
        while ( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a ;
    }
    public static void main(String[] args){
        int num1 = 21;
        int num2 = 6;

int result = Hcf( num1 , num2 );

System.out.println(" The  Hcf of   " + num1 + " and " + num2 + " is :" + result);

    }
}