package functions;

import java.util.Scanner;

public class basics {
    public static void printMyName(String name) {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entr name");
        String name = scan.next();

        printMyName(name);
    }
}
