package ifelse;

import java.util.Scanner;

public class IfIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the percentage : ");
        int x = scan.nextInt();

        System.out.print("enter the percentage : ");
        int y = scan.nextInt();

        System.out.print("enter the percentage : ");
        int z = scan.nextInt();

        if (x > y) {
            if (x > z) {
                System.out.println("X is largest");
            } else {
                System.out.println("Z is largest");
            }
        }
        if (y > x) {
            if (y > z) {
                System.out.println("Y is largest");
            } else {
                System.out.println("Z is largest");
            }
        }
    }
}
