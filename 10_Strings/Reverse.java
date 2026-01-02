
class Reverse {

    public static String ReverseStr(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);

        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "Prince";
        String reverse = ReverseStr(str);
        System.out.print(reverse);
    }
}
