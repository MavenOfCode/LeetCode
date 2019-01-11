package AlphaValue;

//for Amy's code - not currently in use
import java.math.BigInteger;

import java.util.*;
//PSEUDOCODE
//ALGORITHM=> AlphaValue
//[HELPER METHOD]Calculate values of alphabet (return map)
//set alphabet as String
//parse string into string array because I hate typing a char array from scratch
//DECLARE Map
//iterate through string
//use formula to calculate value
// put character as key and value in map
//added if loop for if value calculated is greater than IntegerMax (goes negative)
//RETURN Map
//[MAIN METHOD] take in search value, return string
//DECLARE String
//see if value is divisible by value in alphaMap
//if yes, use stringbuffer (corrected from stringbuilder) to add that alphaKey as many times as needed,
// subtracting alphaValue from search
// value until search is 0
//if no, find next smallest number and do as above (recursively)
//RETURN String

public class AlphaValue {

    public static void main(String[] args) {
        System.out.println(alphaValue());
        System.out.println(returnAlpha(54));
    }

    public static StringBuffer returnAlpha(int inputNumber){

        //instantiate stringbuffer to add letters to to return alphaValue string that represents inputNumber as
        // described in problem domain
        StringBuffer returnAplhaValue = new StringBuffer();

        if(inputNumber <= 0){
            returnAplhaValue.append("Sorry that isn't a valid input, the number must be greater than 0.");
            return returnAplhaValue ;
        }
        if(inputNumber >= Integer.MAX_VALUE -1){
            returnAplhaValue.append("Sorry that isn't a valid input, the number must be less than Integer.Max_Value " +
                    "in Java.");
            return returnAplhaValue ;
        }

        //call helper method to build alphaValue Map per problem domain
        Map<String, Integer> testAlphaValueMap = alphaValue();

        //bring in alpha array for adding to returnAlphaValue variable for result of method
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        String[] alpha = alphaString.split("");

        //loop through testAlphaValueMap to incrementally decrease inputNumber value as letters are found and added
        // to returnAlphaValue
        for(int i = 0; inputNumber > 0; i++){

            //assign value from Map so it can be subtracted from the inputNumber
            int alphaValue = testAlphaValueMap.get(alpha[i]).intValue();

            //assign letter from Map so it can be added to the string
            String letter = alpha[i];

            //only if alphaValue from map is smaller than input number subtract it from the input number
            //and assign the letter to the returnAlphaValue result of the method
            //COMMENT: NOT WORKING - Needs to start with largest value less than input number from Map....
            //refactor map to treemap? hashmap? need to research available methods on each to find largest
            //value that is less than inputnumber at start....and keep repeating with that number till i has to go to
            // smallest
            if (alphaValue <= inputNumber) {
                inputNumber = inputNumber - alphaValue;
                returnAplhaValue.append(letter);
            }
        }
        return returnAplhaValue;

    }

    public static Map<String,Integer> alphaValue(){
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        String[] alpha = alphaString.split("");
        Map<String, Integer> alphaMap = new HashMap<>();
        alphaMap.put("a",1);
        int i = 1;
        while(i < alpha.length){
            //if statement for first time returned int goes past Integer.MAX (goes negative)
            if(alphaMap.get(alpha[i-1]).intValue() < 0){
                System.out.println("You've hit maximum value of ints at " + alphaMap.get(alpha[i-1]).intValue() + " " +
                        "with " +
                        "letter " + alpha[i-1] + ".");
                //removes negative value/letter pair from map
                alphaMap.remove(alpha[i-1]);
                return alphaMap;
            }
            alphaMap.put(alpha[i],(((i+1)*alphaMap.get(alpha[i-1]).intValue())+(i+1)));
            i++;
        }
        return alphaMap;
    }


// AMY COHEN SOLUTION - FOR DISCUSSION
//    private static TreeMap<Integer, String> addLetterValuesUsingInts() {
//        TreeMap<Integer, String> letterMap = new TreeMap<>();
//        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        int previousLetterValue = 0;
//        int nextLetterIndex = 0;
//        int key = 0;
//
//
//        letterMap.put(1, alphabet[0]);
//        for (int i = 1; i < alphabet.length-6; i++ ) {
//            nextLetterIndex = i+1;
//            previousLetterValue = letterMap.lastEntry().getKey();
//            key = (nextLetterIndex*previousLetterValue)+nextLetterIndex;
//            letterMap.put(key, alphabet[i]);
//        }
//        return letterMap;
//    }
//
//    public static String letterValues(int n) {
//        if (n == 0) {
//            throw new Error("OutOfRange: Number entered cannot be 0 (zero) or null");
//        }
//
//        StringBuffer answer = new StringBuffer();
//        int currentKey = 0;
//        while (n > 0) {
//            currentKey = addLetterValuesUsingInts().floorKey(n);
//            answer.append(addLetterValuesUsingInts().get(currentKey));
//            n -= currentKey;
//        }
//        return answer.toString();
//    }
//
//
//    public static String letterValues(Long n) {
//        if (n == 0 || n == null) {
//            throw new Error("OutOfRange: Number entered cannot be 0 (zero) or null");
//        }
//
//        StringBuffer answer = new StringBuffer();
//        long currentKey = 0;
//        while (n > 0) {
//            currentKey = addLetterValuesUsingLong().floorKey((long)n);
//            answer.append(addLetterValuesUsingLong().get(currentKey));
//            n -= currentKey;
//        }
//        return answer.toString();
//    }
//
//    public static String letterValues(BigInteger n) {
//
//        BigInteger passedInValue = new BigInteger(String.valueOf(n));
//        if (passedInValue.equals(BigInteger.ZERO) || passedInValue.equals("null")) {
//            throw new Error("OutOfRange: Number entered cannot be 0 (zero) or null");
//        }
//
//        StringBuffer answer = new StringBuffer();
//        BigInteger currentKey;
//        while (passedInValue.compareTo(BigInteger.ZERO) > 0) {
//            currentKey = addLetterValuesusingBigInt().floorKey(passedInValue);
//            answer.append(addLetterValuesusingBigInt().get(currentKey));
//            passedInValue = passedInValue.subtract(currentKey);
//        }
//        return answer.toString();
//    }
//
//    private static TreeMap<Integer, String> addLetterValuesUsingInts() {
//        TreeMap<Integer, String> letterMap = new TreeMap<>();
//        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        int previousLetterValue = 0;
//        int nextLetterIndex = 0;
//        int key = 0;
//
//
//        letterMap.put(1, alphabet[0]);
//        for (int i = 1; i < alphabet.length-6; i++ ) {
//            nextLetterIndex = i+1;
//            previousLetterValue = letterMap.lastEntry().getKey();
//            key = (nextLetterIndex*previousLetterValue)+nextLetterIndex;
//            letterMap.put(key, alphabet[i]);
//        }
//        return letterMap;
//    }
//
//
//    private static TreeMap<Long, String> addLetterValuesUsingLong() {
//        TreeMap<Long, String> letterMap = new TreeMap<>();
//        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        Long previousLetterValue = (long) 0;
//        long nextLetterIndex = 0;
//        long key = 0;
//
//
//        letterMap.put((long)1, alphabet[0]);
//        for (int i = 1; i < alphabet.length; i++ ) {
//            nextLetterIndex = (long)i+1;
//            previousLetterValue = letterMap.lastEntry().getKey();
//            key = (nextLetterIndex*previousLetterValue)+nextLetterIndex;
//            letterMap.put(key, alphabet[i]);
//        }
//        return letterMap;
//    }
//
//
//    private static TreeMap<BigInteger, String> addLetterValuesusingBigInt() {
//        TreeMap<BigInteger, String> letterMap = new TreeMap<>();
//        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        BigInteger previousLetterValue;
//        BigInteger nextLetterIndex;
//        BigInteger keyPart1;
//        BigInteger keyFull;
//        BigInteger plusOne = new BigInteger("1");
//
//        BigInteger one = new BigInteger("1");
//        letterMap.put(one, alphabet[0]);
//        for (int i = 1; i < alphabet.length; i++ ) {
//            nextLetterIndex = new BigInteger(String.valueOf(plusOne.add(BigInteger.valueOf(i))));
//            previousLetterValue = letterMap.lastEntry().getKey();
//
//            keyPart1 = (nextLetterIndex.multiply(previousLetterValue));
//            keyFull = keyPart1.add(nextLetterIndex);
//            letterMap.put(keyFull, alphabet[i]);
//        }
//        return letterMap;
//    }

}
