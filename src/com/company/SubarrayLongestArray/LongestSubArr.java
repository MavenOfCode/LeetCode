package com.company.SubarrayLongestArray;

public class LongestSubArr {

    //my written out algorithm - feedback is that this is too long

    //first instantiate a current length of 0 for the continuous sub array
    //then instantiate a previous value to compare the first element against of negative min integer
    //then instantiate a longest value of for the longest value seen so far
    //next iterate through the input array
    //each iteration, if the  current value(current element in the array) is greater than the previousValue,
        // increment the length value by one and set the longest value seen to the current length value,
        // if not set current length to 1, the previous value to the current element in the array
    //then go to next element in the array and start again to increment the length if next value is larger.
    //when iteration is complete return longest length seen

    //trying to pseudo code the above

    // curr leng = 0  for cont sub array
    // prev value = negative min integer to compare against first element in array
    // longest = longest sub array seen so far
    //iterate through array
     // -- test if current value == prev value +1 then  add to curr leng and if curr leng > longest
    //      assign longest value of curr leng
    // --- else if curr value isn't == prev value +1 then set curr leng to 1
    //return longest

    //note - this method returns longest continuous sub array where the increment differece between elements is 1 or
    // greater

    public static int findLengthOfLCIS(int[] nums) {
        int currentLength = 0;
        int previousValue = Integer.MIN_VALUE;
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > previousValue ){
                currentLength++;
                previousValue = nums[i];
                if( currentLength > longest){
                    longest = currentLength;
                }
            } else {
                currentLength = 1;
                previousValue = nums[i];
            }
        }
        return longest;
    }

    //this is the version I did during a coderpad interview
    //interviewer and i worked out optimization to remove one variable
    //this method returns longest sub arrays when the elements are only EXACTLY differing by 1
    public static int findLongestInterview(int[] inputArray){

        int longest = 0;
        int currentLength = 0;

        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] == inputArray[i-1]+1){
                currentLength++;
                if(currentLength > longest){
                    longest = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        return longest;
    }
}

//Python solution from Beverly (makes no sense to me really)
//    def findLengthOfLCIS(self, nums):
//        """
//        :type nums: List[int]
//        :rtype: int
//        """
//        if not nums:
//        return 0
//
//        subarr = [nums[0]]
//        length = 1
//        longest = 1
//        for i in range(1, len(nums)):
//        if nums[i] > subarr[-1]:
//        subarr.append(nums[i])
//        length += 1
//        else:
//        if length > longest:
//        longest = length
//        subarr = [nums[i]]
//        length = 1
//        if length > longest:
//        return length
//        return longest

//Carl's JS solution also passes 100%
//var findLengthOfLCIS = function(nums) {
//        let previousVal = -Infinity;
//        let currentLength = 0;
//        let longest = 0;
//
//        for (let i = 0; i < nums.length; i++) {
//        if (nums[i] > previousVal) {
//        currentLength++;
//        previousVal = nums[i];
//        if (currentLength > longest) {
//        longest = currentLength;
//        }
//        } else {
//        currentLength = 1;
//        previousVal = nums[i];
//        }
//        }
//        return longest;
//        };