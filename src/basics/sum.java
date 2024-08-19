import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number");
        int x = scan.nextInt();

        System.out.println("enter the second number");
        int y = scan.nextInt();

        int sum = x + y;
        System.out.println("sum is" + sum);
    }
}
