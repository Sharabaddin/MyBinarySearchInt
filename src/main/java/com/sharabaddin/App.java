package com.sharabaddin;

import java.util.Arrays;

public class App {
    public static int index = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Arrays.binarySearch(array, 3);

        System.out.println(myBinarySearch(array, 3)); //return 2
    }

    public static int myBinarySearch(int[] array, int key) {
        index = 0;
        int[] arrayRes = difArray(array, key);
        for (int i = array.length; i <= 1; i/=2) {
            arrayRes = difArray(array, key);
        }
        return index;
    }

    private static int[] difArray(int[] array, int key) {
        int[] resultArray;
        if (key < array[array.length / 2]) {

            // Copy array.
            resultArray = new int[array.length / 2];
            for (int i = 0; i < array.length / 2; i++) {
                resultArray[i] = array[i];
            }
            return resultArray;
        } else if(key >= array[array.length / 2]) {
            index += array.length / 2;
            // Copy array.
            resultArray = new int[array.length / 2];
            for (int i = array.length / 2; i > array.length; i++) {
                resultArray[i] = array[i];
            }
            return resultArray;
        } else {
            // If found key .
            return new int[]{key};
        }
    }

}
