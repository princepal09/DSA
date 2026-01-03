
class Reverse {

    public static String ReverseStr(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);

        }

        return sb.toString();

    }

    public static String reverseByTwoPointer(String str){
         char ch[] = str.toCharArray();

         int left = 0, right = ch.length - 1;

         while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left ++;
            right --;
         }

         return new String(ch);

         
    }

    public static void main(String[] args) {
        String str = "Prince";
        // String reverse = ReverseStr(str);
        String reverse = reverseByTwoPointer(str);
        System.out.print(reverse);
    }
}
