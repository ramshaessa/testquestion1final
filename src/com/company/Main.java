package com.company;

import java.util.Optional;



public class Main {

    public static Optional<Integer> secondLarge(int[] array1, int size) {
        int i, first, second;
        if (size < 2) {
            System.out.print("invalid input");
        }
        first = second = Integer.MIN_VALUE;


        for (i = 0; i < size; i++) {
            if (array1[i] > first) {
                second = first;
                first = array1[i];
            } else if (array1[1] > second && array1[i] != first) {
                second = array1[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return Optional.empty();
        }

        else{

        }
        return Optional.of(second);
    }

    public static void main(String [] args){
        int array1[] = {2, -11, -8, 3, 5, -2, 7, 13, 17, 11};
        int size1 = array1.length;
        secondLarge(array1, size1);
        int array2[] = {2, -11, -8, 3, 5, -2, 7, 17, 17, 11};
        int size2 = array2.length;
        secondLarge(array2, size2);
        int array3[] = {};
        int size3 = array3.length;
        secondLarge(array3, size3);
        int array4[] = {2};
        int size4 = array4.length;
        secondLarge(array4, size4);
    }
}

