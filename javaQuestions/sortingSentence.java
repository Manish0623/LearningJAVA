

class sortingSentence {

    // DSA method to sort words using Bubble Sort
    public static void sortWords(String[] words) {
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String sentence = "how are you mate";
        String[] words = sentence.split(" ");
        sortWords(words);
        for (String w : words) {
            System.out.print(w + " ");
        }
    }
}
