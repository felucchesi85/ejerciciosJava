package CountUppercaseCharacters;

public class CountUppercaseCharacters  {
    public static void main(String[] args) {
        String text = "JavaIsAWESOME";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of uppercase letters: " + count);
    }
}
