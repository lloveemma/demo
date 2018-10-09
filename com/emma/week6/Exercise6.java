package com.emma.week6;

public class Exercise6 {

    public static void main(String[] args) {
        new Exercise6().run();
    }

    public void run() {
        String[] palindromes = { "anna", "kayak", "madam", "rotor", "wow" };
        String[] notPalindromes = { "test", "palindrome", "car", "bike" };

        for(String palindrome : palindromes) {
            if(isPalindrome(palindrome)) {
                System.out.println(palindrome + " is a palindrome!");
            } else {
                System.out.println(palindrome + " is NOT a palindrome!");
            }
        }

        for(String palindrome : notPalindromes) {
            if(isPalindrome(palindrome)) {
                System.out.println(palindrome + " is a palindrome!");
            } else {
                System.out.println(palindrome + " is NOT a palindrome!");
            }
        }
    }

    private boolean isPalindrome(String palindrome) {
        String tmp = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            tmp += palindrome.charAt(i);
        }

        return tmp.equals(palindrome);
    }

}
