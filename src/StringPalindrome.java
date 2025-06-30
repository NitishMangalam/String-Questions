public class StringPalindrome {
    public static boolean checKPalindrome(String x) {
        int left = 0;
        int right = x.length()-1;
        while (left<right) {
            if (x.charAt(left)!=x.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String x = "racecar";
        String y = "madhu";
        System.out.println(x+" -> "+ checKPalindrome(x));
        System.out.println(y+" -> "+ checKPalindrome(y));
    }
}
