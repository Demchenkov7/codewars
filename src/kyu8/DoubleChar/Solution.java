package kyu8.DoubleChar;

import java.io.CharArrayReader;

public class Solution {
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
}
