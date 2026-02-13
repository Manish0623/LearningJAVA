
// class findingLastlength{
//     public static int lastLength(String str){
//         int length = 0;
//         int i = str.length() - 1 ;


//        while(i>=0 && str.charAt(i) == ' '){
// i--;
//        }

//    while(i>= 0 && str.charAt(i) != ' '){
//     length++;
//     i--;
//    }
//    return length;
//     }
//     public static void main(String[] args) {
//         String str = " what the hell is going on here.";
//         int result = lastLength(str);
//         System.out.print(result);
//     }}

class findingLastlength {

    public static int lastLength(String str) {
        int length = 0;
        int i = str.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        // Count only letters in the last word
        while (i >= 0 && Character.isLetter(str.charAt(i))) {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String str = " yeh sbb mil kai...";
        int result = lastLength(str);
        System.out.print(result);
    }
}
