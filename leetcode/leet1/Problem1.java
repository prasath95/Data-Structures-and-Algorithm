package leetcode.leet1;

import java.util.HashMap;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }   

        for (int i = 0; i < nums.length; i++) {
            int neededValue=target - nums[i];
            
            if(hashMap.containsKey(neededValue) && hashMap.get(neededValue)!=i){
                return new int[]{i,hashMap.get(neededValue)};
            }
        }
        return new int[]{};
    }
}
