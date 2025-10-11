import java.io.*;
import java.util.*;

public class StringEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println(" Enter a String:");
String str = sc.next();
sc.close();

String reversed  = "";

for(int i=str.length() -1 ; i>=0 ; i--){
reversed  = reversed + str.charAt(i);
}
if(str.equals(reversed)){
    System.out.println(" String are same.. ");
}else{
    System.out.println(" Its different. ");
}
    }
}