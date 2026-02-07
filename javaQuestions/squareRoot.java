

class squareRoot {

    public static int squareRoot(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int left = 1;
        int right = n;
        int result = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;  // ✅ overflow safe

            long square = (long) mid * mid;

            if(square == n){
                return mid;
            }
            else if(square < n){
                result = mid;       // store possible answer
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;  // floor square root
    }

    public static void main(String[] args) {
        int n = 16;
        int result = squareRoot(n);
        System.out.print("Square root is: " + result);
    }
}
