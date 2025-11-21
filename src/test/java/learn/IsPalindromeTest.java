package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(1221));
    }

    @Test
    void isNotPalindrome() {
        assertFalse(IsPalindrome.isPalindrome(123212));
    }


}