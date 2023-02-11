package kyu8.howOld;

import javax.swing.*;

public class CharProblem {
    public static int howOld(final String herOld) {
        String[] split = herOld.split(" ");
        int old = Integer.parseInt(split[0]);
        return old;
    }


    public static void main(String[] args) {
        howOld("5 years old");
    }
}
