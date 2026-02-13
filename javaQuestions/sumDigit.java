class sumDigit{
    public static int Sum(int n){
        if(n == 1){
            return n;
        }
        return (n % 10 + Sum(n/10));
    }
    public static void main(String[] args){
        int n = 1234;
        int result = Sum(n);
        System.out.print(result);
    }
}