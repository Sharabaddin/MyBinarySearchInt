package com.sharabaddin;


import java.util.*;
import java.util.function.Predicate;

public class Searcher {
    private static int findElementIndex = 0;

    public static int binary(int[] array, int key) {
        findElementIndex = 0;

        // Check null and empty.
        if(array == null || array.length == 0) {
            return -1;
        }

        // Check one element.
        if(array.length == 1) {
            if(array[0] == key) {
                return 0;
            } else {
                return -1;
            }
        }

        // Not found
        if(key < array[0] || key > array[array.length - 1])
            return -1;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }



        int middle = (array.length+1) / 2 - 1;
        System.out.println("start:" + middle);
        for (int i = array.length; i > 1; i /= 2) {

            if(array[middle] == key)
                return middle;


            if (key <= array[middle]) {
                System.out.println("left");

                if(i<6) {
                    middle--;
                } else if(i<10) {
                    middle -= 2;
                } else
                    middle-=3;

                System.out.println(middle);
                System.out.println("i=" + i);

            } else {
                System.out.println("right");

                if(i<6) {
                    middle++;
                } else if(i<10) {
                    middle += 2;
                }else
                    middle+=3;


                System.out.println(middle);
                System.out.println("i=" + i);
            }

        }
        return middle;


    }


}
