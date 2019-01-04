package com.company.addDigits;

public class addDigits {

    //with recursion
    public static int addDigits(int num) {
        //if input number is a single digit, just return it
        //for recursion this is the base case
        //no need for if less than 0 case due to problem domain parameters
        //being input can only be positive whole integers
        if(num < 10){
            return num;
        }
        //variable to track the new sum when splitting an integer and adding
        //the the digits together
        int newSum = 0;

        //recursion while loop that exits when num value changes to 0
        while (num !=0){

            //use modulus to find remainder of the number when divided by 10
            newSum += num % 10;

            //divide input number by 10 to find the whole tens digit of the input
            //so it can be added to the remainder to fulfil requirements of problem
            num = num/10;
        }

        //recursively call the method on the new sum value until it is a single digit
        //return single digit, as base case, solve problem domain
        return addDigits(newSum);
    }

    //v2 without recursion
    //need a double while loop (can't use for loop - don't know length)
    public static int addDigits2(int num) {

        //by setting while loop for double digit or greater numbers the base case is
        // automatically taken care of with the return statement (base case being
        //single digit)
        while (num >= 10){

            //start newSum variable inside the outer while loop to keep it within scope
            int newSum = 0;

            //this loop will apply while the new sum is greater than 0 but not when the num is <10
            while(num >0){

                //use modulus to find remainder of the number when divided by 10
                newSum += num % 10;

                //divide input number by 10 to find the whole tens digit of the input
                //so it can be added to the remainder to fulfil requirements of problem
                num = num/10;
            }
            //because newSum is only within the outer while loop scope set it to value
            //of outer variable for return by method
            num = newSum;
        }
        return num;
    }
}
