package kyu8.AreaOrPerimeter;

public class Solution {
    public static int areaOfPerimeter(int l, int w) {
        return l == w ? l*w : 2*l + 2*w;
    }

}
