package Intersection2Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        // //edge cases
        // if(nums1.length <1 && nums2.length <1){
        //     return nums1;
        // } else if (nums1.length <1){
        //     return nums2;
        // } else if (nums2.length <1){
        //     return nums1;
        // }
        //find uniques in first int array and put into Set
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1){
            set1.add(n);
        }
        //find uniques in second int array and put into second set
        Set<Integer> set2 = new HashSet<>();
        for (int t : nums2){
            set2.add(t);
        }
        // find intersection of two sets
        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int index = 0;
        for (int s : set1){
            result[index++] = s;
        }
        return result;
    }
}