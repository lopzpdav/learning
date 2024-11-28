package org.mine.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    public void isPalindrome_False() {
        boolean result = Palindrome.isPalindrome("Azzzzzaz");
        Assertions.assertFalse(result);
    }

    @Test
    public void isPalindrome_True() {
        boolean result = Palindrome.isPalindrome("this123 321sihtAAA");
        Assertions.assertTrue(result);
    }


    @Test
    public void simplifier(){
        String simplifiedText = Palindrome.simplify("sa mp le t e s t ------");

        Assertions.assertEquals(simplifiedText,"sampletest");
    }
}