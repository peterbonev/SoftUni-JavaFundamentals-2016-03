import java.util.Scanner;

public class Problem6_SumNumber1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0;

        for (int count = 1; count <= i; count++)
            sum += count;

        System.out.println(sum);

    }
}
