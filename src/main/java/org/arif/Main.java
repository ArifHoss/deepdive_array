package org.arif;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 1};
        int length = numbers.length;
        int[] newNumber = new int[length * 2];


        for (int i = 0; i < numbers.length; i++) {
            newNumber[i] = numbers[i];
            newNumber[numbers.length + i] = numbers[i];
        }
        System.out.println(Arrays.toString(newNumber));
//        int[] numbers = {1, 0, 3, 2, 4, 5, 6};
//// numbers[i]            1, 0, 3, 2, 4, 5, 6(indexs value)
//// numbers[numbers[i]]   0, 1, 2, 3, 4, 5, 6(values index)
//        for (int i = 0; i < numbers.length; i++) {
////            System.out.print(numbers[i]+ ", ");
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[numbers[numbers[i]]]);
//
//        }
    }
}