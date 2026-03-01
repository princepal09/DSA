public class L_OF_LASTWORD{

    public static int lengthOfLastWord(String s){
        s = s.trim();
        int n = s.length();
        int count = 0;
        for(int i = n - 1; i>=0; i--){
            if(s.charAt(i) == ' ') break;
            count ++;
        }
        return count;

    }
    public static void main(String args[]){
        String s = "fly to the moon ";
        int count = lengthOfLastWord(s);
        System.out.println(count);
    }
}