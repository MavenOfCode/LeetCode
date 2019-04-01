package ArrayExceptSelf;

import java.util.Arrays;

public class productArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,4,2,3};
//        example output [24, 6, 12, 8]
        System.out.println(Arrays.toString(productArrayExceptSelf.productExceptSelf(nums)));

        System.out.println(Arrays.toString(productButSelf(nums)));
    }

    //with division which was asked not to be used
    public static int[] productExceptSelf(int[] nums) {
        //edge case
        if(nums.length <=1){
            return nums;
        }
        //declare result output array
        int[] output = new int[nums.length];
        //iterate through nums array for product and divide by self to remove self from product in the output array

        for(int i = 0; i < nums.length; i ++){
            output[i] = 1;
            for (int j = 0; j < nums.length ; j++){
                output[i] *= nums[j];
            }
            output[i] = output[i]/nums[i];
        }
        return output;
    }

//    https://leetcode.com/problems/product-of-array-except-self/discuss/135882/A-Java-solution-with-an-explanation
    public static int[] productButSelf(int[] nums) {
        //edge case
        if(nums.length <=1){
            return nums;
        }

        //iterate through nums array for product from left
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < nums.length; i ++){
            left[i] = left[i-1] * nums[i-1];
        }

        int[] right = new int[nums.length];
        //iterate from right
        right[nums.length-1] =1;
        for (int j = nums.length -2; j >= 0 ; j--){
           right[j] = right[j+1] * nums[j +1];
        }

        //declare result output array
        int[] output = new int[nums.length];
        for (int k = 0; k < output.length; k++){
            output[k] = left[k] * right[k];
        }
        return output;
    }

}
