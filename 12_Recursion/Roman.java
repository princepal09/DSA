
public class Roman {

    public static int getVal(char c) {
        switch (c) {
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

    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            if (i < n - 1) {
                char ch2 = s.charAt(i + 1);
                if (getVal(ch1) < getVal(ch2)) {
                    sum -= getVal(ch1);
                } else {
                    sum += getVal(ch1);
                }

            } else {
                sum += getVal(ch1);
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(romanToInt("IV"));
    }
}
