package kyu7.ShortestWord;

import java.util.Arrays;


public class findShort {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        return Arrays.stream(words)
                .map(String::length)
                .sorted((s1, s2) -> s1 - s2)
                .findFirst().get();
    }
}

