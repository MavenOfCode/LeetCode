package ContainsDupes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDupes {

    //two possible approaches
    //1. iterate through an array for each value in the array (this would require a nested loop)
    //2. Hash Map
        //store each value in the array into a hash map with a count of 1 and then iterate through
        // the loop one more time the second any count goes to 2 return true and break out of the method

    //3. Per discussion with Ahmed try using hashset instead
    //~~~PSEUDO CODE~~~
    //ALGORITHM ==> boolean containsDupes
    //DECLARE result = false
    //DECLARE HashMap check <int array[i], count>
    //for each i in array
        //if !check.contains(array[i])
       /// check.put(array[i], 1)
    //else result = true
    //RETURN result

    //hashmap method
    public static boolean containsDupes(int[] array){
        boolean result = false;
        Map<Integer, Integer> check = new HashMap<Integer, Integer>();

        //initial wrong use of index reference to put into and check in Map
        for(Integer i : array){
            if(!check.containsKey(i)){
                check.put(i,1);
            } else {
                result = true;
            }
        }
        return result;
    }

    //hashset method
    public static boolean containsDupesS(int[] inputArray){
        Set<Integer> check = new HashSet<Integer>();
        boolean result = false;
        for( int element : inputArray){
            if(!check.add(element)){
                result = true;
            }
        }
        return result;
    }
}
