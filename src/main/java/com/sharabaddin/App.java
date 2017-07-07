package com.sharabaddin;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        // Correct output 2(index for 3 value).
        System.out.println(Searcher.binary(array, 6));
    }
}
