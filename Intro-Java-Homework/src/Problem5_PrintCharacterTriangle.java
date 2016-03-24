
import java.util.Scanner;

import static java.lang.Character.*;

class Problem5_PrintCharacterTriangle {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String result = new String("a");
        System.out.println(result);
        result +=" ";
        for (int count = 1; count < i; count++){
            result +=(char)('a'+count);
            result +=" ";
            System.out.println(result);

        }
        for (int count = result.length(); count > 1 ; count -=2)
            System.out.println(result.substring(0, count));

    }
}
