import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the character");
        char ch = scan.next().charAt(0);
        System.out.print("char is :" + ch);
    }
}
