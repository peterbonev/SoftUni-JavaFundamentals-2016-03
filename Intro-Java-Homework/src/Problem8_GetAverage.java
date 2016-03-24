import java.util.Scanner;

public class Problem8_GetAverage {
    public static void main(String[] args) {
        // write your code here

        double[] inputNumbers = new double[3];
        Scanner sc = new Scanner(System.in);
        inputNumbers[0] = Double.parseDouble(sc.next());
        for (int i = 1; i < 3; i++) {

            //String[] dump = input.split(" ");
            //for (String i : dump)

            sc = new Scanner(System.in);
            inputNumbers[i] = Double.parseDouble(sc.next());
        }
        System.out.printf("%.2f \n",getAverage(inputNumbers[0], inputNumbers[1], inputNumbers[2]));

    }
    private static double getAverage(double numberA, double numberB, double numberC) {
        double average = (numberA + numberB + numberC) / 3;
        return average;
    }
}
