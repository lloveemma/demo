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
            // ��λȡ�ַ���ת�����ַ���Ȼ��ת��ΪСд��ĸ
            String str = String.valueOf(sampleText.charAt(i)).toLowerCase();
            for (int j = 0; j < vowels.length; j++) {
                // ת��Сд��ĸ��Ƚ�
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
            // ��λȡ�ַ���ת�����ַ���Ȼ��ת��ΪСд��ĸ
            String str = String.valueOf(sampleText.charAt(i)).toLowerCase();
            // �ո��.����Ԫ���ַ�
            if (" ".equals(str) || ".".equals(str)) {
                count--;
                continue;
            }
            // ΪԪ���ַ������1
            for (int j = 0; j < vowels.length; j++) {
                if (str.equals(vowels[j])) {
                    // ת��Сд��ĸ��Ƚ�
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}
