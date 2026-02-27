import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        Longest_Common_Prefix sol = new Longest_Common_Prefix();

        String[] strs = {"flower", "flow", "flight"};

        String result = sol.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}
