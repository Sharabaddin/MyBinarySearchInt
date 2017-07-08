package com.sharabaddin;

public class Searcher {
    public static int binary(int[] array, int key) {
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

        // Not found.
        if(key < array[0] || key > array[array.length - 1])
            return -1;

        // Search middle and check <> and offset on relative (size new range).
        int middle = ((array.length + 1) / 2) - 1;
        for (int i = array.length; i > 1; i /= 2) {

            if(array[middle] == key) {
                return middle;
            }

            if (key <= array[middle]) {
                // Offset left.
                middle -= (i + 2) / 4;
            } else {
                // Offset right.
                middle += (i + 2) / 4;
            }
        }

        // Check found and no found in array not row.
        if(array[middle] == key) {
            return middle;
        } else {
            return -1;
        }
    }
}
