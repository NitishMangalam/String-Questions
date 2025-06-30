import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstUniqueCharacter {

    public static Character findNonRepeatingChar(String str) {
        // Use LinkedHashMap to maintain insertion order
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Found the first non-repeating character
            }
        }

        return null; // If all characters repeat
    }

    public static void main(String[] args) {
        String str = "aabbccXdeff";
        Character result = findNonRepeatingChar(str);
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

