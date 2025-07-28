package WordReverser;

public class WordReverser { 

    public static void main(String[] args) {
        System.out.println(reverseWord("hello world")); // olleh
        System.out.println(reverseWord2("hello world")); // world hello
        System.out.println(reverseWord3("hello world")); // world hello
        System.out.println(reverseWord4("hello world")); // world hello
        System.out.println(reverseWord5("hello world")); // world hello
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static String reverseWord2(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }

    public static String reverseWord3(String word) {
        String[] words = word.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverseWord4(String word) {
        String[] words = word.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static String reverseWord5(String word) {
        String[] words = word.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
        }
        return reversed.toString();
    }
}
