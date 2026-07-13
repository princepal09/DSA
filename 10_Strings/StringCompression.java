
public class StringCompression {

    public static int compress(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 1;
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == ch) {
                j++;
                count++;
            }
            sb.append(ch);

            if (count > 1) {
                sb.append(count);

            }
            i = j;

        }
        return sb.length();
    }


    public static int com(char chars[]){

        int i = 0;
        while(i < chars.length){
            int ch = chars[i];
            int count = 1;
            int j = i + 1;

            while(j < chars.length && ch == chars[j]){
                count ++;
                j ++;
            }

            
        }
      
      return chars.length;

    }

    public static void main(String args[]) {
        String s = "aabbccc";
        char ch[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        // String ans = compress(s);
        int ans = compress(s);
        int ans2 = com(ch);
        System.out.println(ans);
    }
}
