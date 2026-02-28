
public class reverseVowel {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String reverseV(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            if (!isVowel(sb.charAt(i))) {
                i++;
            } else if (!isVowel(sb.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Leetcode";
        System.out.println(reverseV(s));
    }
}
