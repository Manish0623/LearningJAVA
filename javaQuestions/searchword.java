import java.util.Scanner;
class searchword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the sentence: ");
        String sentence = sc.nextLine();


        System.out.print(" Enter the word: ");
        String target = sc.next();

boolean found = false;
        String[] word = sentence.split(" ");
        for(int i= 0; i<word.length ; i++){
    if(word[i].equals(target)){
        found = true;
        break;

    }
}
if(found){
    System.out.print("It is present.");
}else{
    System.out.print(" not present..");
}
    }}
