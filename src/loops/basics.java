package loops;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the principle : ");
        int x = scan.nextInt();

        int sum = 0;
       for(int i = 0; i <= x ; i++){
           sum = sum + i;
       }
        System.out.print("sum : " + sum);
    }

}
