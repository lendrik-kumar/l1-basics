package ifelse;

import java.util.Scanner;

public class elseIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the percentage : ");
        int x = scan.nextInt();

        if(x > 90){
            System.out.println("A grade");
        }
        else if(x>70){
            System.out.println("B grade");
        }
        else if(x>50){
            System.out.println("C grade");
        }
        else {
            System.out.println("D grade");
        }

    }
}
