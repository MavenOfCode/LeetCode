package TwoArraysII;

import java.util.*;

public class TwoArraysII {

    //HashSet would be best here I think
    //On second though, since frequency of integer matters
    //HashMap for count

    //ALGORITHM ==> intersect
    //DECLARE HashMap intersects
    //Declare HashSet for result that will be converted to array
    //For array 1 add values to HashMap with count
    //For array 2 if value is contained in HashSet
    //add value to result array
    //NOTE to self ---check about number of times to add to array---
    //return hashset.toArray

    //commenting out to try brute force approach
//    public static int[] intersect(int[] nums1, int[] nums2){
//
//        Map<Integer,Integer> intersect = new HashMap<>();
//        List<Integer> result = new ArrayList<>();
//
//        //put array 1 into hashmap
//        for(int i = 0; i < nums1.length; i++){
//            int count = 1;
//            if(!intersect.containsKey(nums1[i])){
//                intersect.put(nums1[i], count);
//            } else{
//                intersect.replace(nums1[i], 1, 2);
//            }
//        }
//
//        //compare array 2 to values in hashmap from array 1
//        for(int j = 0; j < nums2.length; j++){
//            if(intersect.containsKey(nums2[j])){
//                result.add(nums2[j]);
////                if(intersect.containsValue(2)){
//////                    result.add(nums2[j]);
////                }
//            }
//        }
//
//        int[] finalResults = new int[result.size()];
//        int k = 0;
//        for(Integer n : result){
//            finalResults[k++] = n.intValue();
//        }
//
//        return finalResults;
//    }

    //Brute force go through both arrays with two for loops

    //PSEUDO
    //ALGORITHM == intersect
    //DECLARE result int[]
    //for i in nums 1
    //for j in nums 2
    /// if nums1[i] = nums2[j]
    /// result[i] = num1[i]

    public static int[] intersect2(int[] nums1, int[] nums2){
        //for result - still need array list since you don't know result length
        List<Integer> result = new ArrayList<>();

        //make sure outer loop is longer than (or equal to)  inner loop
        int length1 = Math.max(nums1.length , nums2.length);
        int length2 = Math.min(nums1.length, nums2.length);
        for(int i = 0; i< length1; i ++){
            for(int j = 0; j <length2; j++){
                if(nums1[i] == nums2[j]){
                    result.add(nums1[i]);
                }
            }

        }
        int[] finalResults = new int[result.size()];
        int k = 0;
        for(Integer n : result){
            finalResults[k++] = n.intValue();
        }

        return finalResults;
    }

}
