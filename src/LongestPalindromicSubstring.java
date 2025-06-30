

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // odd-length
            int len2 = expandAroundCenter(s, i, i + 1);   // even-length
            int len = Math.max(len1, len2);

            if (len > (end - start)) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "racecar";

        System.out.println(s1 + " → " + longestPalindrome(s1)); // bab or aba
        System.out.println(s2 + " → " + longestPalindrome(s2)); // bb
        System.out.println(s3 + " → " + longestPalindrome(s3)); // racecar
    }
}

