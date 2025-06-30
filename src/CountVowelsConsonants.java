import java.util.Locale;

public class CountVowelsConsonants {
    public static void countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();
        for (char ch:s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;

                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels:-> " + vowels);
        System.out.println("Consonants:-> " + consonants);
    }
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch)!=-1;
    }

    public static void main(String[] args) {
        String input = "Madhubala Venus Queen";
        countVowelsAndConsonants(input);
    }
}
