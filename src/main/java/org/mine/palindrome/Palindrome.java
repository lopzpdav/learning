package org.mine.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String simplifiedText = simplify(text);
        String reversedSimplifiedText = new StringBuilder(simplifiedText).reverse().toString();

        return simplifiedText.equals(reversedSimplifiedText);
    }

    public static String simplify(String text) {
        return text.replaceAll("[^a-z0-9]","");
    }
}
