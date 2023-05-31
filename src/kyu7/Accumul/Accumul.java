package kyu7.Accumul;

import java.nio.file.Path;

public class Accumul {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < i+1 ; j++) {
                if (j == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
            if (i != s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("Rasd"));
        // output R-Aa-Sss-Dddd
    }
}
