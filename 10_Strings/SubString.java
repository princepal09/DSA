class SubString {

    public static String SubStr(String str, int si, int ei) {
        StringBuilder sb = new StringBuilder("");

        for (int i = si; i < ei; i++) {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Prince";
        String subs = SubStr(str, 0, 3);
        System.out.println(subs);
        System.out.println(str.substring(0, 4));
    }
}
