
public class RomanInteger {

    public static int getVal(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    
    public static int romanToInteger(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int ch1 = getVal(s.charAt(i));
            if (i < n - 1) {
                int ch2 = getVal(s.charAt(i + 1));
                if (ch1 < ch2) {
                    sum -= ch1;

                } else {
                    sum += ch1;
                }
            } else {
                sum += ch1;
            }
        }
        return sum;

    }

    public static void main(String args[]) {
        String s = "MCMXCIV";
        int n = 1020;
        int ans = romanToInteger(s);
        System.out.println(ans);
    
    }
}
