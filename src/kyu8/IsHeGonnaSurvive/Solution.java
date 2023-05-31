package kyu8.IsHeGonnaSurvive;

public class Solution {
    public static boolean hero(int bullets, int dragons) {
        return (long) bullets >= (long) 2 * dragons ? true : false;
    }
}
