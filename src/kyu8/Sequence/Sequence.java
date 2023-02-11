package kyu8.Sequence;


public class Sequence {

    public static int[] reverse(int n){
        //your code
        int number = n;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = number;
            number--;
        }
        return numbers;
    }
}
