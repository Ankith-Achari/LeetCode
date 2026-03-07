package Array;

import java.util.Arrays;

public class Max_El {
    public static void main(String[] args) {
        Max_El ob = new Max_El();
        int[] nums = {3,2,3}; //[2,2,1,1,1,2,2]
        int major = ob.majorityElement(nums);
        System.out.println(major);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        return nums[n];
    }
}
