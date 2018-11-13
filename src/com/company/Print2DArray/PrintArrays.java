package com.company.Print2DArray;

//warm up for phone tech screen (not LeetCode)

public class PrintArrays {
    //take in a whole positive integer  equal to or greater than 1 and print that integer's worth of rows of arrays
    //with each array holding each value and 4 values that are multiples of the original value and the next value
    //until the the length equals the input integer
    //each array must be printed in a single line with spaces between each integer
    //there must be a total number of lines that equals the input number of rows

    public static String printArrays(int rows){
        for (int i = 1; i <= rows; i ++){
            for (int j = 1; j < rows +1 ; j++){
                int value = i* j;
                if(value <10) {
                    System.out.print(value + "  ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
        return "complete";
    }
}
