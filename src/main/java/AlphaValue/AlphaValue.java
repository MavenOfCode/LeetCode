package com.company.AlphaValue;

import java.util.*;



public class AlphaValue {

    //PSEUDOCODE
    //ALGORITHM=> AlphaValue
    //[HELPER METHOD]Calculate values of alphabet (return map)
        //set alphabet as String
        //parse string into string array because I hate typing a char array from scratch
        //DECLARE Map
        //iterate through string
        //use formula to calculate value
        // put character as key and value in map
       //RETURN Map
    //[MAIN METHOD] take in search value, return string
        //DECLARE String
        //see if value is divisible by value in alphaMap
        //if yes, use stringbuilder to add that alphaKey as many times as needed, subtracting alphaValue from search
         // value until search is 0
        //if no, find next smallest number and do as above (recursively)
       //RETURN String


    public static Map<String,Integer> alphaValue(){
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        String[] alpha = alphaString.split("");
        Map<String, Integer> alphaMap = new HashMap<>();
        alphaMap.put("a",1);
        int i = 1;
        while(i < alpha.length){
            alphaMap.put(alpha[i],(((i+1)*alphaMap.get(alpha[i-1]).intValue())+(i+1)));
            i++;
            System.out.println(i);
        }

        return alphaMap;
    }

}
