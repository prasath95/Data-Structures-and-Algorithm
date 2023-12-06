package questions.check_if_pair_with_the_given_sum_exists_in_array;

import java.util.Arrays;

public class Problem {

    /*
     * greedy approuch
     */
    public boolean isSumExists1(int[] array,int sum){
        //first loop run from 0 to size of the array
        for (int i = 0; i < array.length; i++) {

            //secons loop run from +1 because that's next value
            for (int j = i+1; j < array.length; j++) {
               int total=array[i]+array[j];
               if(total==sum){
                return true;
               }
            }
        }
        return false;
    }

     /*
     * two pointers approch
     */
    public boolean isSumExists2(int[] array,int sum){

        //dort the array, so the array values starts from small to max
        Arrays.sort(array);

        //
        int i=0;
        int j=array.length-1;
        while (i<j) {
            int total=array[i]+array[j];
            if(total>sum){
                j--;
            }else if(total<sum){
                i++;
            }else{
                return true;
            }
        }
        
        return false;
    }


    /*
     * todo -  binnary search
     */
     public boolean isSumExists3(int[] array,int sum){
        
        return false;
    }


     /*
     * todo -   Two Sum using Hashing
     */
     public boolean isSumExists4(int[] array,int sum){
        
        return false;
    }


     /*
     * todo -   Two Sum Using remainders of the elements less than x
     */
     public boolean isSumExists5(int[] array,int sum){
        
        return false;
    }

    
}
