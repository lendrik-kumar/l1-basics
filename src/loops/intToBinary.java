package loops;

import java.util.Scanner;

public class intToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int x = scan.nextInt();
        int ans = 0;

        int y = 1;

        while(x > 0){
            int parity = x % 2;
            ans += parity * y;
            y *= 10;
            x /= 2;
        }
        System.out.println(ans);

    }
}
