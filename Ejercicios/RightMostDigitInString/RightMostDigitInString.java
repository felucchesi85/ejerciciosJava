package RightMostDigitInString;

import java.util.Optional;

public class RightMostDigitInString {
    public static void main(String[] args) {
        String text = "abc123xyz";
        Optional<Character> rightMostDigit1 = findRightmostDigit(text);
        char rightMostDigit2 = rightMostDigit(text);
        char rightMostDigit3 = rightMostDigit2(text);

        if (rightMostDigit1.isPresent()) {   
            System.out.println("Rightmost digit 1: " + rightMostDigit1.get());
        } else {
            System.out.println("No digits found.");
        }
        if (rightMostDigit2 != ' ') {
            System.out.println("Rightmost digit 2: " + rightMostDigit2);
        } else {
            System.out.println("No digits found.");
        }
        if (rightMostDigit3 != ' ') {
            System.out.println("Rightmost digit 3: " + rightMostDigit3);
        } else {
            System.out.println("No digits found.");
        }   
    }	

        public static char rightMostDigit(String text) {
            for (int i = text.length() - 1; i >= 0; i--) {
                if (Character.isDigit(text.charAt(i))) {
                    return text.charAt(i);
                }
            }
            return ' ';
        }


        public static char rightMostDigit2(String text) {

            char result = ' ';

            for (int i = text.length() - 1; i >= 0; i--) {
                if (Character.isDigit(text.charAt(i))) {
                    result = text.charAt(i);
                    break;
                }
            }

            if (result != ' ') {
                System.out.println("Rightmost digit 2: " + result);
            } else {
                System.out.println("No digits found.");
            }
            return result;
        }

        public static Optional<Character> findRightmostDigit(String text) {
            if (text == null || text.isEmpty()) {
                return Optional.empty();
            }
            
            for (int i = text.length() - 1; i >= 0; i--) {
                if (Character.isDigit(text.charAt(i))) {
                    return Optional.of(text.charAt(i));
                }
            }
            return Optional.empty();
        }


}

	

