package kyu7.ReverseWords;

public class Kata {
    public static String reverseWords(final String original) {
        String[] list = original.split(" ");
        String[] reverseList = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            StringBuilder sb = new StringBuilder(list[i]);
            reverseList[i] = (sb.reverse().toString());
        }
        return String.join(" ", reverseList);
    }
}
