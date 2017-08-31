package com.foxminded;

import com.foxminded.anagram.AnagramMaker;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter string:\n");
        System.out.println(AnagramMaker.makeAnagram(reader.nextLine()));
    }
}
