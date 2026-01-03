
public class VowelsConsonants {

    public static int[] CountVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        boolean hasLetter = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch >= 'a' && ch <= 'z') {
                hasLetter = true;

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            }

        }

        if (!hasLetter) {
            return null;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String str = "Monika123";

        int reverse[] = CountVowelsConsonants(str);
        if (reverse == null) {
            System.out.println("Given String is not Valid");
            return;
        }
        System.out.println("Vowels Count of given String are:" + reverse[0]);
        System.out.println("Consonants Count of given String are:" + reverse[1]);

    }

}
