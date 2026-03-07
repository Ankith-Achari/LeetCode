package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pascal ob = new Pascal();
        List<List<Integer>> list = ob.generate(n);
        for(List<Integer> row: list){
            System.out.println(row);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return triangle;
    }
}
