package questions.check_if_pair_with_the_given_sum_exists_in_array;

/*
 * Check if pair with given Sum exists in Array (Two Sum)
 * Given an array A[] of n numbers and another number x,
 *  the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 
 * 
 */

public class Main {
    public static void main(String[] args) {

        int[] array = {0, -1, 2, -3, 1};
        int x= -2;

        // int[] array={1, -2, 1, 0, 5};
        // int x = 0;

        Problem problem=new Problem();
        boolean result=problem.isSumExists1(array, x);
        System.out.println("is Sum Exists 1 - "+result);

        boolean result2=problem.isSumExists2(array, x);
        System.out.println("is Sum Exists 2 - "+result2);


    }
}
