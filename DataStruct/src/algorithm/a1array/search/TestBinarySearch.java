package algorithm.a1array.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {
    @Test
    @DisplayName("binarySearchBasic 找到")
    public void test1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0,BinarySearch.binarySearchBasic(a,7));
        assertEquals(1,BinarySearch.binarySearchBasic(a,13));
        assertEquals(2,BinarySearch.binarySearchBasic(a,21));
        assertEquals(3,BinarySearch.binarySearchBasic(a,30));
        assertEquals(4,BinarySearch.binarySearchBasic(a,38));
        assertEquals(5,BinarySearch.binarySearchBasic(a,44));
        assertEquals(6,BinarySearch.binarySearchBasic(a,52));
        assertEquals(7,BinarySearch.binarySearchBasic(a,53));
    }

    @Test
    @DisplayName("binarySearchBasic 没找到")
    public void test2(){
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1,BinarySearch.binarySearchBasic(a,0));
        assertEquals(-1,BinarySearch.binarySearchBasic(a,15));
        assertEquals(-1,BinarySearch.binarySearchBasic(a,60));
    }

    @Test
    @DisplayName("binarySearchAlternative 找到")
    public void test3() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0,BinarySearch.binarySearchAlternative(a,7));
        assertEquals(1,BinarySearch.binarySearchAlternative(a,13));
        assertEquals(2,BinarySearch.binarySearchAlternative(a,21));
        assertEquals(3,BinarySearch.binarySearchAlternative(a,30));
        assertEquals(4,BinarySearch.binarySearchAlternative(a,38));
        assertEquals(5,BinarySearch.binarySearchAlternative(a,44));
        assertEquals(6,BinarySearch.binarySearchAlternative(a,52));
        assertEquals(7,BinarySearch.binarySearchAlternative(a,53));
    }

    @Test
    @DisplayName("binarySearchAlternative 没找到")
    public void test4(){
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1,BinarySearch.binarySearchAlternative(a,0));
        assertEquals(-1,BinarySearch.binarySearchAlternative(a,15));
        assertEquals(-1,BinarySearch.binarySearchAlternative(a,60));
    }
}
