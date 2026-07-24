
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Subsequence {

    public static void getAllSub(String str, int i, List<String> ans, StringBuilder output) {
        if (i >= str.length()) {
            String subseq = output.toString();
            ans.add(subseq);
            return;
        }

        char ch = str.charAt(i);

        //includes
        output.append(ch);
        getAllSub(str, i + 1, ans, output);
        output.deleteCharAt(output.length() - 1);

        //excludes
        getAllSub(str, i + 1, ans, output);

    }

    public static List<String> subseq(String str) {
        StringBuilder output = new StringBuilder();

        List<String> ans = new ArrayList<>();
        int i = 0;
        getAllSub(str, i, ans, output);
        Collections.sort(ans);
        return ans;

    }

    public static void main(String args[]) {
        // String str = "abc";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        List<String> ans = subseq(str);
        for(String i : ans){
            System.out.print(i + " ");
        }

    }
}
