package loops;

import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");
         int i,x = scan.nextInt();

         for(i = 0; x>0 ; i++){
             x = x/10;
         }
        System.out.println(i+"is the number of terms");
    }
}
