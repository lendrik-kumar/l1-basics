package loops;

import java.util.Scanner;

public class bnryToInt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");
        int sum = 1, ans = 0, i, y, x = scan.nextInt();

        for (i = 0; x > 0; i++) {
            y = x % 10;
            ans = ans + y*sum;
            x /= 10;
           sum *= 2;
        }
        System.out.println("int is" + (ans));
    }
}