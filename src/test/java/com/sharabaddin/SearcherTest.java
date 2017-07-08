package com.sharabaddin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SearcherTest {
    @Test
    public void testBinary_arrayIsNull() {
        assertEquals(-1, Searcher.binary(null, 6));
    }

    @Test
    public void testBinary_arrayIsEmpty() {
        int[] array = {};
        assertEquals(-1, Searcher.binary(array, 2));
    }

    @Test
    public void testBinary_sizeArrayMaxInteger() {
        int[] array = new int[Integer.MAX_VALUE];
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            array[i] = i;
        }

        assertEquals(Integer.MAX_VALUE, Searcher.binary(array, Integer.MAX_VALUE));
    }

    @Test
    public void testBinary_notFoundDownRange() {
        assertEquals(-1, Searcher.binary(new int[] {2, 3 , 4}, 1));
    }

    @Test
    public void testBinary_notFoundUpRange() {
        assertEquals(-1, Searcher.binary(new int[] {2, 3 , 4}, 5));
    }

    @Test
    public void testBinary_notFoundInRange() {
        assertEquals(-1, Searcher.binary(new int[] {1, 3 , 5, }, 2));
    }

    @Test
    public void testBinary_arrayNotInRow() {
        assertEquals(2, Searcher.binary(new int[] {1, 5 , 12,}, 12));
    }

    @Test
    public void testBinary_found_1() {
        assertEquals(2, Searcher.binary(new int[] {1, 5 , 12,}, 12));
    }

    @Test
    public void testBinary_notFound_1() {
        assertEquals(-1, Searcher.binary(new int[] {1}, 7));
    }

    @Test
    public void testBinary_found_2() {
        assertEquals(0, Searcher.binary(new int[] {4, 9}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9}, 9));
    }

    @Test
    public void testBinary_found_3() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20}, 20));
    }

    @Test
    public void testBinary_found_4() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31}, 31));
    }

    @Test
    public void testBinary_found_5() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56}, 56));
    }

    @Test
    public void testBinary_found_6() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87}, 87));
    }

    @Test
    public void testBinary_found_7() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93}, 93));
    }

    @Test
    public void testBinary_found_8() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102}, 102));
    }

    @Test
    public void testBinary_found_9() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112}, 112));
    }

    @Test
    public void testBinary_found_10() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 112));
        assertEquals(9, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117}, 117));
    }

    @Test
    public void testBinary_found_11() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 112));
        assertEquals(9, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 117));
        assertEquals(10, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132}, 132));
    }

    @Test
    public void testBinary_found_12() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 112));
        assertEquals(9, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 117));
        assertEquals(10, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 132));
        assertEquals(11, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140}, 140));
    }

    @Test
    public void testBinary_found_13() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 112));
        assertEquals(9, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 117));
        assertEquals(10, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 132));
        assertEquals(11, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 140));
        assertEquals(12, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145}, 145));
    }

    @Test
    public void testBinary_found_14() {
        assertEquals(0, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 4));
        assertEquals(1, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 9));
        assertEquals(2, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 20));
        assertEquals(3, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 31));
        assertEquals(4, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 56));
        assertEquals(5, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 87));
        assertEquals(6, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 93));
        assertEquals(7, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 102));
        assertEquals(8, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 112));
        assertEquals(9, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 117));
        assertEquals(10, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 132));
        assertEquals(11, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 140));
        assertEquals(12, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 145));
        assertEquals(13, Searcher.binary(new int[] {4, 9, 20, 31, 56, 87, 93 ,102, 112, 117, 132, 140, 145, 149}, 149));
    }

}
