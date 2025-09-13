

import java.util.Scanner;
public class RemoveString{
    public static  String remove( String input ){
    StringBuilder result  = new StringBuilder();

for ( char ch : input.toCharArray()){
    if( ch != ' ' ){
        result.append(ch);
    }
}
return result.toString();
}


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


System.out.println(" Enter a string : ");
String str = sc.nextLine();

String noSpaces =  remove(str);
System.out.println(noSpaces);


}

}
