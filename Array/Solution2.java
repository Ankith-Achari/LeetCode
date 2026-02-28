package Array;
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for(int j=0;j< nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        Solution2 ob = new Solution2();
        int val = 2;
        int n = ob.removeElement(nums, val);

        System.out.print("Number of Elements: " + n);
        System.out.println("\nThe array elements(after): ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
