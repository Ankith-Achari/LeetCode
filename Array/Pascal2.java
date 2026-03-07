package Array;

import java.util.*;

public class Pascal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pascal2 ob = new Pascal2();
        List<Integer> list = ob.getRow(n);
        System.out.println(list);
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(
                            triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j)
                    );
                }
            }
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}

