package leetcode.leet1;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,2,4}; 
        int target = 6;
        Problem1 problem1=new Problem1();
        int arr[]=problem1.twoSum(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(""+arr[i]);
        }
       
    }
}
