
class stringLength{
    public static int length(String str , int i){
        if(i == str.length()){
            return 0;
        }else{
            return 1 + length(str , i+1);
        }
    }
    public static void main(String[] args){
        String str = " what the hell";
        int result = length( str , 0);
        System.out.print(result);
    }
}