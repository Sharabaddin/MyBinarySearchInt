package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SearcherTest extends TestCase {
    public void testBinary() {


        // Not found element.
        assertEquals(-1, Searcher.binary(new int[] {1, 2, 3, 4}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1, 2, 3}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1}, 6));
        assertEquals(-1, Searcher.binary(new int[] {1, 2}, 6));

        // Array is null.
        assertEquals(-1, Searcher.binary(null, 6));

        // Array is empty.
        assertEquals(-1, Searcher.binary(new int[] {}, 6));

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
        assertEquals(0, (Searcher.binary(new int[] {1, 2, 3, 4, 5}, 1)));
        assertEquals(1, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 2));
        assertEquals(2, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 3));
        assertEquals(3, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 4));
        assertEquals(4, Searcher.binary(new int[] {1, 2, 3, 4, 5}, 5));

    }
}
