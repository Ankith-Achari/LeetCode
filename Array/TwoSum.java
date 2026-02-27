package Array;

import java.util.Scanner;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;++i)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int target = sc.nextInt();

        TwoSum ob = new TwoSum();
        int[] result = ob.twoSum(nums,target);

        if(result.length == 2){
            System.out.println("Indices: " + result[0]+"," +  result[1] );
        }
        else{
            System.out.println("No solution found");
        }
    }
}
