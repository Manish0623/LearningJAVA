

public class Main2 {
    public static void main(String[] args) {
        int p = 7, q = 7, r = 5;

        if ((p + r) < (q - p) || r < p) {
            r = (q & p);
            r = ((r + 3) & p);
          
        } else {
            System.out.println("Sum of p + q + r: " + (p + q + r));
        }
    }
}
