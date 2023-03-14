package kyu7.Digit;

public class SquareDigit {

    public static int squareDigits(int n) {
        String strDigit = String.valueOf(n);
        String result = "";

        for (char c : strDigit.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }
        return Integer.parseInt(result);
    }


}

