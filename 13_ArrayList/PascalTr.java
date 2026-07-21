import java.util.*;
x
class PascalTr {

    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }

            curr.add(1);
            res.add(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        System.out.print(ans);
    }
}
