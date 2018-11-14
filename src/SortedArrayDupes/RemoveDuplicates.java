package SortedArrayDupes;

//first iterate through the given sorted array
//check each element in the array against the next element for duplicates
// if any element matches any other element remove that element from the current array
//to do this in place rewrite the current array element values while shortening the length of the current array

//CANNOT GET CORRECT ARRAY LENGTH WITHOUT LEET CODE SPECIAL PARSING CODE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        int lengthCounter = 0;
        int currentElement = 1;
        while(currentElement < nums.length){
            if(nums[currentElement] != nums[currentElement -1]){
                nums[lengthCounter++] = nums[currentElement];
            }
            currentElement++;
        }
        System.out.println("here is deduped array" + Arrays.toString(nums));
        System.out.println("here is final new length" +  (lengthCounter+1));
        return lengthCounter +1;
    }
}

//modifying code from leetcode for array changes
