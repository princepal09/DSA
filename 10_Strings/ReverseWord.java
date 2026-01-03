
public class ReverseWord {

    public static String WordRev(String str) {
        StringBuilder result = new StringBuilder("");

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }

        }

        return result.toString();

    }

    public static void main(String[] args) {
        String str = "You know What You are Very Gorgeous";
        System.out.println(WordRev(str));
    }
}
