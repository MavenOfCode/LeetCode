package SortedArrayDupes;

//first iterate through the given sorted array
//check each element in the array against the next element for duplicates
// if any element matches any other element remove that element from the current array
//to do this in place rewrite the current array element values while shortening the length of the current array

//CANNOT GET CORRECT ARRAY LENGTH WITHOUT LEET CODE SPECIAL PARSING CODE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    //first solution got correct length, but wrong array print out nixing it but leaving to better understand later
//    public static int removeDuplicates(int[] nums){
//
//        int length = nums.length;
//
//        if(length <2){
//            System.out.println("this is the original array" + Arrays.toString(nums));
//            System.out.println("this is the original length of the array - no duplicates found - " + length);
//        }
//
//        for(int i = 1; i <nums.length; i ++){
//            if(nums[i] == nums [i-1]){
//                length -= 1;
//                nums[i] = nums[i -1];
//                i++;
//            }
//        }
//        System.out.println("Here is the revised array without duplicates");
//        System.out.println(Arrays.toString(nums));
//        System.out.println("here is the length of the de-dupcliated array");
//        System.out.println(length);
//        return length;
//    }

    public static int removeDuplicates(int[] nums){
        if(nums.length < 2){
            System.out.println(Arrays.toString(nums));
            System.out.println(nums.length);
            return nums.length;
        }
        List finalArray = new ArrayList();
        finalArray.add(nums[0]);
        int newLength = nums.length;
        for(int i = 1; i< nums.length; i ++){
            if(nums[i] == nums[i-1]){
                newLength -=1;
            }
            if(nums[i-1] != nums[i]) {
                finalArray.add(nums[i]);
            }
        }
        System.out.println(finalArray.toString());
        System.out.println("here is final new length " +  (newLength));
        return newLength;
    }
}

//modifying code from leetcode for array changes
