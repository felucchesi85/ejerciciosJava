package WordCounter;

import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Singleton es un patrón, ??? de diseño de software ";
        String[] words = countWords(sentence);
        
        System.out.println("Word count: " + words.length);
        System.out.println("Words:");
        for (String word : words) {
            System.out.println("'" + word + "'");
        }
    }

    public static String[] countWords(String sentence) {
        String normalizedSentence = removeAccents(sentence);
        
        // Dividir por espacios y filtrar solo palabras válidas
        String[] splitWords = normalizedSentence.trim().split("\\s+");
        List<String> validWords = new ArrayList<>();
        
        for (String word : splitWords) {
            // Solo incluir palabras que contengan al menos una letra
            if (word.matches(".*[a-zA-Z].*")) {
                validWords.add(word);
            }
        }
        
        return validWords.toArray(new String[0]);
    }

    public static String removeAccents(String text) {
        // Normalizar el texto usando NFD (Normalization Form Canonical Decomposition)
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
        
        // Eliminar todos los caracteres diacríticos (acentos, diéresis, etc.)
        // El método \\p{InCombiningDiacriticalMarks}+ es una expresión regular que coincide con uno o más caracteres diacríticos
        //diacriticos son los acentos, diéresis, etc.
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }
}
