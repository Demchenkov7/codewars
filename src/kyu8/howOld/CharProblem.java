package kyu8.howOld;


public class CharProblem {
    public static int howOld(final String herOld) {
        String[] split = herOld.split(" ");
        int old = Integer.parseInt(split[0]);
        return old;
    }

}
