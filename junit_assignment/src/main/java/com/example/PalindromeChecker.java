package com.example;

public class PalindromeChecker {
    public boolean isPalindrome(String input){
        String normal = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(normal).reverse().toString();
        return normal.equals(reversed);
    }
}
