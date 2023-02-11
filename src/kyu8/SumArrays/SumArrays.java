package kyu8.SumArrays;

public class SumArrays {

    public static void main(String[] args) {
        double[] num = new double[]{1, 5.2, 4, 0, -1};
        System.out.println(sum(num));
    }

    public static double sum(double[] numbers) {
        double sum = 0d;
        if (numbers == null) {
            return 0.0;
        } else {
            for (double sumNumbers : numbers){
                sum += sumNumbers;
            }
        }
        return sum;
    }
}
