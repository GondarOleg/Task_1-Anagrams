package com.foxminded.anagram;

public class AnagramMaker {

    public static String makeAnagram(String string) {
        String anagram = "";
        if (string.length() > 1) {
            String tempString = "";
            for (int i = 0; i < string.length(); i++) {
                if (Character.isLetter(string.charAt(i))) {
                    tempString += string.charAt(i);
                } else {
                    tempString = swapCharsInString(tempString);
                    anagram += tempString + string.charAt(i);
                    tempString = "";
                }
            }
            if (!tempString.isEmpty()) {
                anagram += swapCharsInString(tempString);
            }
            return anagram;
        }
        return string;
    }

    public static String swapCharsInString(String string) {
        String tempString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            tempString += string.charAt(i);
        }
        return tempString;
    }
}
