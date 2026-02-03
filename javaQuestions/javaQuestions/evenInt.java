

class evenInt{
    public static void main(String[] args){
int[] arr= {1,12,32,43,55,678};
int count = 0;


for( int num : arr){
    int digits = 0;
    int n = Math.abs(num);

    if( n== 0 ) digits = 1;

    while(n>0){
        digits++;
        n/=10;
    }
    if( digits % 2 ==0){
        count++;
    }
}
 System.out.print(count);
    }
   
}