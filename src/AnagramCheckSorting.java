import java.util.Arrays;

public class AnagramCheckSorting {
    public static boolean isAnagram(String s,String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        char[] x = s.toCharArray();
        char[] y =t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y);

    }

    public static void main(String[] args) {
        String s = "trianglex";
        String t ="integralx";
        System.out.println("Are "+s+" and "+t +" is "+ "anagrams-> " + isAnagram(s,t));
    }
}
