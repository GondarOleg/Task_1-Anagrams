package com.foxminded.anagram;

public class AnagramMaker {
    public static String makeAnagram(String string) {

        if (string.length() > 1) {
            String[] wordsArr = string.split(" ");
            string = "";
            for (String s : wordsArr
                    ) {
                String tempString = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    tempString = tempString + s.charAt(i);
                }
                string = string + tempString + " ";
            }
        }
        return string;
    }
}
