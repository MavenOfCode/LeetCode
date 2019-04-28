package Asteroids;

import java.util.Arrays;
import java.util.Stack;

public class Asteroids {

    public static void main(String[] args) {
        int[] asteroids1 = {10, 2, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {5, 10, -5};
        int[] asteroids4 = {-2, -1, 1, 2};
        int[] asteroids5 = {-2,-2,-2,2};
        int[] asteroids6 = {-2,-2,-2,1};


        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids1)));
        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids2)));
        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids3)));
        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids4)));
        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids5)));
        System.out.println(Arrays.toString(Asteroids.asteroidCollision(asteroids6)));
    }

//    refereced https://leetcode.com/problems/asteroid-collision/discuss/193403/Java-easy-to-understand-solution
    public static int[] asteroidCollision(int[] asteroids){
        //edge case
        if (asteroids.length <= 1){
            return asteroids;
        }
        //build stack to track surviving asteroids
        Stack<Integer> trackStack = new Stack<>();

        //iterate through asteroid array
        for (int i : asteroids){
            //if  value of asteroid is positive add to tracking stack
            if(i > 0){
                trackStack.push(i);
            } else {
                //if next asteroid is bigger than asteroid in the stack, and moving left, remove the asteroid in the
                // stack
                while (!trackStack.isEmpty() && trackStack.peek() > 0 && trackStack.peek() < Math.abs(i)){
                    trackStack.pop();
                }
                //if there are no asteroids in the stack or the asteroid is moving to the right add the next asteroid
                // to the stack
                if (trackStack.isEmpty() || trackStack.peek() < 0){
                    trackStack.push(i);
                //the the next asteroid and the most recent are of equal value they destroy each other
                } else if (i + trackStack.peek() == 0){
                    trackStack.pop();
                }
            }
        }

        int[] result = new int[trackStack.size()];
        for (int j = trackStack.size() - 1; j >= 0; j--) {
            result[j] = trackStack.pop();
        }
        return result;
    }
}

    //write data structure, incomplete/wrong approach trying again after reviewing leetcode solutions and discussing
//    // with Amy Cohen
//    public static int[] asteroidCollision(int[] asteroids) {
//        //edge case if no asteroids or only 1 asteroid are present
//        if (asteroids.length <= 1) {
//            return asteroids;
//        }
//        Stack<Integer> trackStack = new Stack<>();
//        int largest = asteroids[0];
//        for (int i = 1; i < asteroids.length; i++) {
//            trackStack.push(largest);
//
//            //asteroids same size and collided so largest asteroid taken out by current
//            if (Math.abs(largest) == Math.abs(asteroids[i]) && asteroids[i] < 0) {
//                trackStack.pop();
//            //unless the next asteroid is imperically larger than the largest asteroid
//            } else if (Math.abs(asteroids[i]) > Math.abs(largest)) {
//                //and both are moving in the same direction - they don't collide so you just add next asteroid to
//                // return list
//                if (asteroids[i] > largest) {
//                    trackStack.push(asteroids[i]);
//                    largest = asteroids[i];
//                //if the next asteroid isn't moving in the same direction they will collide and, since it is larger
//                //it will destroy the largest, therefore  removing it from the stack and it will be added to the
//                    // stack
//                } else {
//                    trackStack.pop();
//                    largest = asteroids[i];
//                }
//                //if the largest is bigger than the next asteroid and they are both moving away (to the right)
//                //the largest actually becomes the bigger negative number asteroid
//            } else if (Math.abs(largest) > Math.abs(asteroids[i])) {
//                if (asteroids[i] < 0 && largest < 0) {
//                    largest = asteroids[i];
//
//                //otheriwse you pop the largest in the stack because you are adding it back in at the start of the loop
//                } else {
//                    trackStack.pop();
//                }
//            } else if (Math.abs(largest) == Math.abs(asteroids[i]) && asteroids[i] > 0) {
//                largest = asteroids[i];
//            }
//        }
//        //build the output int array from the stack with first in, first out by going from end to front
//        int[] result = new int[trackStack.size()];
//        for (int j = trackStack.size() - 1; j >= 0; j--) {
//            result[j] = trackStack.pop();
//        }
//        return result;
//    }
//}

    //this approach - a slice/array approach might work for go but not java. retrying with first instinct of stack in
//    // java
//    public static int[] asteroidCollision(int[] asteroids) {
//        //edge case if no asteroids or only 1 asteroid
//        if (asteroids.length <= 1) {
//            return asteroids;
//        }
//        //array evaluation in order
//        //store biggest asteroid
//        int largest = asteroids[0];
//
//        int[] result = new int[]{};
//
//        for(int i = 1; i < asteroids.length-1; i ++ ) {
//            if (largest == -(asteroids [i])){
//                //do not add to result
//            }
//            if (largest < asteroids[i]) {
//                if (asteroids[i] > 0){
//                    result[i] = largest;
//                    result[i+1] = (asteroids[i]);
//                }
//            }
//            if(largest > asteroids[i]){
//                result[i] = largest;
//            }
//            largest = asteroids[i];
//        }
//        return result;
//    }
//}

