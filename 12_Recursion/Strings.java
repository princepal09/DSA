
public class Strings {

    public static String removeA(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallAns = removeA(s, idx + 1);

        char curr = s.charAt(idx);
        if (curr != 'a') {
            return curr + smallAns;
        } else {
            return smallAns;
        }

    }

    // without indexing 
    public static String removea(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = removea(s.substring(1));

        char curr = s.charAt(0);
        if (curr != 'a') {
            return curr + smallAns;
        } else {
            return smallAns;
        }

    }

    // Reverse String
    public static String reverseStr(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallAns = reverseStr(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    // check string is palindrome or not
    public static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        String str = "saaas";
        String s = "Monika";
        System.out.println(removeA(str, 0));
        System.out.println(removea(str));
        System.out.println(reverseStr(s, 0));

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str+" is Palindrome");
        } else {
            System.out.println(str+" is NOt Palindrome");

        }
    }
}
