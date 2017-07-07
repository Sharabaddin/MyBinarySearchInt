package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SearcherTest extends TestCase {
    public void testBinary() {
        // Array is null.
        assertEquals(-1, Searcher.binary(null, 6));

        // Array is empty.
        int[] array = {};
        assertEquals(-1, Searcher.binary(array, 2));

        // Search one element.
        assertEquals(0, Searcher.binary(new int[] {1}, 1));
        assertEquals(-1, Searcher.binary(new int[] {1}, 7));

        // Not found in range.
        assertEquals(-1, Searcher.binary(new int[] {2, 3 , 4}, 1));
        assertEquals(-1, Searcher.binary(new int[] {2, 3 , 4}, 5));

        // Two element
        assertEquals(1, Searcher.binary(new int[] {1, 2}, 2));
        assertEquals(0, Searcher.binary(new int[] {1, 2}, 1));

        // Three element
        assertEquals(0, Searcher.binary(new int[] {1, 2, 3}, 1));
        assertEquals(1, Searcher.binary(new int[] {1, 2, 3}, 2));
        assertEquals(2, Searcher.binary(new int[] {1, 2, 3}, 3));



        // Not found element.
        assertEquals(-1, Searcher.binary(new int[] {1, 2, 3, 4}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1, 2, 3}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1, 2}, 6));





        // Search one element.
        assertEquals(0, Searcher.binary(new int[] {7}, 7));

        // Search two elements.
        assertEquals(1, Searcher.binary(new int[] {1, 2}, 2));
        assertEquals(0, Searcher.binary(new int[] {1, 2}, 1));

        // Search three elements.
        assertEquals(0, Searcher.binary(new int[] {1, 2, 3}, 1));
        assertEquals(1, Searcher.binary(new int[] {1, 2, 3}, 2));
        assertEquals(2, Searcher.binary(new int[] {1, 2, 3}, 3));

        // Search four elements.
        assertEquals(0, Searcher.binary(new int[] {1, 2, 3, 4}, 1));
        assertEquals(1, Searcher.binary(new int[] {1, 2, 3, 4}, 2));
        assertEquals(2, Searcher.binary(new int[] {1, 2, 3, 4}, 3));
        assertEquals(3, Searcher.binary(new int[] {1, 2, 3, 4}, 4));


        // Search five elements.
        assertEquals(0, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 1));
        assertEquals(1, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 2));
        assertEquals(2, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 3));
        assertEquals(3, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 4));
        assertEquals(4, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 5));

        // Search six elements. Start not 1
        assertEquals(0, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 7));
        assertEquals(1, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 8));
        assertEquals(2, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 9));
        assertEquals(3, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 10));
        assertEquals(4, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 11));
        assertEquals(5, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12}, 12));

        // Search 7 elements. Start not 1
        assertEquals(0, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 7));
        assertEquals(1, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 8));
        assertEquals(2, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 9));
        assertEquals(3, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 10));
        assertEquals(4, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 11));
        assertEquals(5, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 12));
        assertEquals(6, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13}, 13));

        //8
        assertEquals(0, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 7));
        assertEquals(1, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 8));
        assertEquals(2, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 9));
        assertEquals(3, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 10));
        assertEquals(4, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 11));
        assertEquals(5, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 12));
        assertEquals(6, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 13));
        assertEquals(7, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14}, 14));

        //10
        assertEquals(0, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 7));
        assertEquals(1, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 8));
        assertEquals(2, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 9));
        assertEquals(3, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 10));
        assertEquals(4, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 11));
        assertEquals(5, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 12));
        assertEquals(6, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 13));
        assertEquals(7, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 14));
        assertEquals(8, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 15));
        assertEquals(9, Searcher.binary(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 16));
    }
}
