package com.sharabaddin;


public class Searcher {
    private static int index = 0;

    public static int binary(int[] array, int key) {
        index = 0;

        // Check null.
        if(array == null )
            return -1;


        // Check one element.
        if(array.length == 1) {
            if(array[0] == key) {
                return 0;
            } else {
                return -1;
            }
        }

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
        } else if(array[0] == key) {
            // If found key .
            return new int[]{key};
        } else {
            return new int[]{};
        }

    }
}
