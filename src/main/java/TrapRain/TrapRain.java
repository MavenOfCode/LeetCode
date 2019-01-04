package TrapRain;

public class TrapRain {
    //https://leetcode.com/problems/trapping-rain-water/
//    Intuition
//
//    Do as directed in question. For each element in the array, find the maximum level of water it can trap after the rain, which is equal to the minimum of maximum height of bars on both the sides minus its own height.
//
//    Algorithm
//
//    Initialize ans=0
//    Iterate the array from left to right:
//    Initialize \text{max_left}=0 and \text{max_right}=0
//    Iterate from the current element to the beginning of array updating:
//            \text{max_left}=\max(\text{max_left},\text{height}[j])
//    Iterate from the current element to the end of array updating:
//            \text{max_right}=\max(\text{max_right},\text{height}[j])
//    Add \min(\text{max_left},\text{max_right}) - \text{height}[i] to \text{ans}ans


    public static int trapRain(int[] array) {
        int rainTrapped = 0;
        int max_left = 0, max_right = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i; j >= 0; j--) { //Search the left part for max bar size
                max_left = Math.max(max_left, array[j]);
            }
            for (int j = i; j < array.length; j++) { //Search the right part for max bar size
                max_right = Math.max(max_right, array[j]);
            }
            rainTrapped += Math.min(max_left, max_right) - array[i];
        }
        return rainTrapped;
    }

//    public static int trap(int[] height) {
//        if (height == null || height.length == 0) return 0;
//
//        int maxLeft = 0, maxright = 0, water = 0, start = 0, end = height.length - 1;
//        while (start < end) {
//            maxright = maxright > height[end] ? maxright : height[end];
//            water += maxLeft < maxright ? maxright - height[start++] : maxright - height[end--];
//        }
//        return water;
//    }

//    public static int waterTrap(int[] buildings) {
//        if (buildings.length == 0) return 0;
//        int maxLeft = 0, maxRight = 0, water = 0, start = 0, end = buildings.length - 1;
//
//        for (int i = end; i > end / 2; i--) {
//            if (maxRight < buildings[end]) {
//                maxRight = buildings[end];
//            }
//        }
//
//        for(int j = start; start < end/2; start++) {
//            if (maxLeft <= buildings[start]) {
//                maxLeft = buildings[start];
//            }
//        }
//        water += Math.min(maxLeft, maxRight);
//        return water;
//
//    }

}
