import java.util.Arrays;

public class ValidAlargam{
    public static boolean isAlargam(String s , String t){
        if(s.length() != t.length() ){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();


Arrays.sort(sArray);
Arrays.sort(tArray);

return Arrays.equals(sArray , tArray);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if(isAlargam(s,t)){
            System.out.println(s + " and " + t + " are alargam ");
        }else{
            System.out.println(" It is not a alargam. ");
        }
    }}



