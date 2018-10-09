package com.emma.week6;

public class Exercise7 {

    public static void main(String[] args) {
        new Exercise7().run();
    }

    public void run() {
        String sampleText = "This is a test. White spaces and dots are not consonants."; // You should not count " " and "." as consonants. Your program does not need to check for other characters, like !, &, etc.

        System.out.println("There are " + countVowels(sampleText) + " vowels in the line: \""+sampleText +"\"");
        System.out.println("There are " + countConsonants(sampleText) + " consonants in the line: \""+sampleText +"\"");
        
        System.out.print("Please input a String:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sampleText  = sc.nextLine();
        sc.close();
        System.out.println("There are " + countVowels(sampleText) + " consonants in the line: \""+sampleText +"\"");
        System.out.println("There are " + countConsonants(sampleText) + " consonants in the line: \""+sampleText +"\"");
    }

    private int countVowels(String sampleText) {
        String[] vowels = {"a","e","i","o","u"};
        int length = sampleText.length();
        int i = 0;
        int count = 0;
        while(i++ < length-1) {
            // 按位取字符，转换成字符串然后转换为小写字母
            String str = String.valueOf(sampleText.charAt(i)).toLowerCase();
            for (int j = 0; j < vowels.length; j++) {
                // 转换小写字母后比较
                if (str.equals(vowels[j])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
    private int countConsonants(String sampleText) {
        String[] vowels = { "a", "e", "i", "o", "u" };
        int length = sampleText.length();
        int i = 0;
        int count = length;
        while (i++ < length - 1) {
            // 按位取字符，转换成字符串然后转换为小写字母
            String str = String.valueOf(sampleText.charAt(i)).toLowerCase();
            // 空格和.不算元音字符
            if (" ".equals(str) || ".".equals(str)) {
                count--;
                continue;
            }
            // 为元音字符，则减1
            for (int j = 0; j < vowels.length; j++) {
                if (str.equals(vowels[j])) {
                    // 转换小写字母后比较
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}
