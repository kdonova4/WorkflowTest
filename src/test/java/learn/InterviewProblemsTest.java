package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterviewProblemsTest {

    private final InterviewProblems func = new InterviewProblems();

    @Test
    void hasFirstNonRepeatingChar() {

        assertEquals('w', func.firstNonRepeatingCharacter("swiss"));

    }

    @Test
    void hasNoNonRepeatingChar() {

        assertNull(func.firstNonRepeatingCharacter("sswwiiss"));
        assertNull(func.firstNonRepeatingCharacter(""));
    }

    @Test
    void mergeArraysEqual()
    {
        int[] actual = func.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});

        assertArrayEquals(new int[]{1,2,3,4,5,6}, actual);

        actual = func.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertArrayEquals(new int[]{1,2,3,4,5,6}, actual);
    }

    @Test
    void mergeArraysIdentical()
    {
        int[] actual = func.mergeArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, actual);
    }

    @Test
    void mergeArraysOneIsEmpty() {

        int[] actual = func.mergeArrays(new int[]{}, new int[]{1, 2, 3});

        assertArrayEquals(new int[]{1,2,3}, actual);
    }

    @Test
    void mergeArraysBothEmpty() {

        int[] actual = func.mergeArrays(new int[]{}, new int[]{});

        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void mergeArraysSingleElement() {
        int[] actual = func.mergeArrays(new int[]{2}, new int[]{1});

        assertArrayEquals(new int[]{1,2}, actual);
    }

    @Test
    void mergeArrayNegatives()
    {
        int[] actual = func.mergeArrays(new int[]{-3, -2, -1}, new int[]{1, 2, 3});

        assertArrayEquals(new int[]{-3, -2, -1, 1, 2, 3}, actual);
    }

    @Test
    void mergeArrayDuplicates()
    {
        int[] actual = func.mergeArrays(new int[]{1, 1, 2}, new int[]{2, 3, 3});

        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, actual);
    }

    @Test
    void didFindOccurences() {

        int actual = func.countOccurrences("hello world", 'o');

        assertEquals(2, actual);
    }

    @Test
    void didFindIntersection() {

        int[] actual = func.findIntersection(new int[]{1, 2, 2, 1}, new int[]{2, 2, 3});

        assertArrayEquals(new int[]{2, 2}, actual);
    }

    @Test
    void isAnagram() {
        assertTrue(func.isAnagram("listen", "silent"));
    }

    @Test
    void fibonacci() {
        assertEquals(2, func.fibonacciNumber(3));
    }

    @Test
    void isLargest() {

        int actual = func.largestElement(new int[]{1,2,3,4,5});

        assertEquals(5, actual);
    }

    @Test
    void isReversedEven() {

        int[] actual = func.reverseArray(new int[]{1,2,3,4});

        assertArrayEquals(new int[]{4, 3, 2, 1}, actual);
    }

    @Test
    void isReversedOdd() {

        int[] actual = func.reverseArray(new int[]{1,2,3,4,5});

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, actual);
    }

    @Test
    void isReversedEmpty() {
        int[] actual = func.reverseArray(new int[]{});

        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void isReversedOneElement() {
        int[] actual = func.reverseArray(new int[]{1});

        assertArrayEquals(new int[]{1}, actual);
    }

    @Test
    void isReversedTwoElements() {
        int[] actual = func.reverseArray(new int[]{1,2});

        assertArrayEquals(new int[]{2, 1}, actual);
    }

    @Test
    void isValidParentheses() {
        boolean actual = func.validParentheses("(())");

        assertTrue(actual);

        actual = func.validParentheses("(())(())");

        assertTrue(actual);
    }

    @Test
    void isNotValidParentheses() {
        boolean actual = func.validParentheses("(()");

        assertFalse(actual);

        actual = func.validParentheses("(()");

        assertFalse(actual);
    }

    @Test
    void foundMissingNumber() {
        int actual = func.findMissingNumber(new int[]{1, 2, 4, 6, 3});

        assertEquals(5, actual);

        actual = func.findMissingNumber(new int[]{1, 2, 5, 6, 3});

        assertEquals(4, actual);

        actual = func.findMissingNumber(new int[]{1, 2, 5, 4, 3});

        assertEquals(6, actual);

        actual = func.findMissingNumber(new int[]{6, 2, 5, 4, 3});

        assertEquals(1, actual);
    }

    @Test
    void isAPalindrome() {

        boolean actual = func.isPalindrome("poop");

        assertTrue(actual);

        actual = func.isPalindrome("rotator");

        assertTrue(actual);

        actual = func.isPalindrome("A man, a plan, a canal, Panama!");

        assertTrue(actual);
    }

    @Test
    void isPalindromeNumber() {
        assertTrue(func.isPalindrome(121));
        assertFalse(func.isPalindrome(1213));
    }

}