package com.company.SubarrayGreatestSum;

class maxSubArray {

    //attempt 1 time is O(n) space is O(n)
    public static int maxSubArray(int[] nums) {

        //edge case empty array
        if(nums.length == 0){
            return 0;
        }

        //set a max sum using an element in the array
        int largestSum = nums[0];

        //create new array to store sum of sub arrays
        int[] sums = new int[nums.length];

        //set first element in new sums array as first element
        //from input array to help avoid null pointer exception in for loop
        sums[0] = nums[0];

        //iterate through the original input array to find the sum
        //of each potential sub array to find the largest sum possible
        for (int i = 1; i < nums.length; i++) {
            //create new element in sums array that finds the greater of two
            //numbers either the original input array element or the
            //sum element from the element prior plus the element in the input
            //array
            sums[i] = Math.max(nums[i], sums[i - 1] + nums[i]);

            //compare and store larges sum found so far during iteration
            largestSum = Math.max(largestSum, sums[i]);
        }
        return largestSum;
    }

    //attempt 2  O(1) in space
    public static int maxSubArraySmaller(int[] nums) {

        //edge case empty array
        if(nums.length == 0){
            return 0;
        }

        //set a current sum using an element in the array
        int currentSum = nums[0];

        //set a max sum that equals the current sum that can track max so far
        int maxSumSoFar = currentSum;

        //iterate through the original input array to find the sum
        //of each potential sub array to find the largest sum possible
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i],  nums[i] + currentSum);
            //compare and store larges sum found so far during iteration
            maxSumSoFar = Math.max(maxSumSoFar, currentSum);
        }
        return maxSumSoFar;
    }
}