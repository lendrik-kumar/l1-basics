package loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");
        int sum=0,i,y,x = scan.nextInt();

        for(i = 0; x>0 ; i++){
            y = x%10;
            sum = sum + y;
            x = x/10;
            sum = sum*10;
        }
        sum = sum /10;
        System.out.println(sum+"is the sum");
    }
}