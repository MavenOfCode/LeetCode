package SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    //for linear time I think a hashmap would be best approach since you need to contain duplicates
    //but not sure about O(n)

    //PSUEDO
    //ALGORITHM == singleNumber
    //DECLARE HashMap of Integers, Integers called check
    //DECLARE int result = 0;
    //for each i : array
    // if(!check.getkey(i))
    // put i, count +1
    //for
    //if(check.getKey(i) && count 2)
    // result = i;
    //RETURN i;

    public static int singleNumberSooz(int[] array){
        Map<Integer,Integer> check = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int value =1;
            if(!check.containsKey(key)){
                check.put(key, value);
            } else{
                //this makes hashset only contain the single number
                // and removes any number that is a duplicate
                check.remove(key,value);
            }
        }
        //goes through refined hashset (of single number) makes it an array and returns
        //that array's initial index value
        return  (int) check.keySet().toArray()[0];
    }

    public static int singleNumberAhmed(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (map.containsKey(nums[i]))
                count = map.get(nums[i]) + 1;
            map.put(nums[i], count);
        }

        int result = 0;
        for (int key : map.keySet())
            if (map.get(key) == 1)
                result = key;

        return result;
    }
}

