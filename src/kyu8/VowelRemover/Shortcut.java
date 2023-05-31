package kyu8.VowelRemover;

public class Shortcut {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

}