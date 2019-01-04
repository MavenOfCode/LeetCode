package RotateArray;


import java.util.Arrays;

public class RotateArray {

//    public static int[] rotateArrayRight (int[] arr, int num) {
//        if (num > 0) {
//            int[] tempArray = arr.clone();
//            for (int i = 0; i < arr.length; i++) {
//                tempArray[i] = i - 1 < 0 ? arr[arr.length - 1] : arr[i + 1];
//            }
//            return rotateArrayRight(tempArray, num - 1);
//        } else {
//            return arr;
//        }
//    }

    public static int[] rotate(int[] nums, int k) {
        if (nums.length < k) {
            System.out.println("Input array not long enough to rotate " + k + " spaces. Original array returned. " + Arrays.toString(nums));
            return nums;
        }
        int[] rotated = new int[nums.length];
        int extraCounter = 0;
        for(int j = k; j< nums.length; j++){
            rotated[j]= nums[extraCounter];
            System.out.println(Arrays.toString(rotated));
            extraCounter++;
        }
        if(k == nums.length -1) {
            for (int i = 0; i < k + 1; i++) {
                rotated[i] = nums[nums.length - k];
                k--;
                System.out.println(Arrays.toString(rotated));
            }
        } else {
            for (int i = 0; i <= k + 1; i++) {
                rotated[i] = nums[nums.length - k];
                k--;
                System.out.println(Arrays.toString(rotated));
            }
        }
        return rotated;
    }
}
