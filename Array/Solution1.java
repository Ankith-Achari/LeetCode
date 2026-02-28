package Array;

public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args){
        int []nums ={0,0,1,1,1,2,2,3,3,4};
        Solution1 ob = new Solution1();
        int n = ob.removeDuplicates(nums);
        System.out.print("Unique Counts: "+n);
        System.out.println("\nThe Unique array elements: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
