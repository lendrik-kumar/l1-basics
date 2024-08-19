package ifelse;

import java.util.Scanner;

public class EvenMultOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the principle : ");
        int x = scan.nextInt();

        if(x%3 == 0 && x%2 == 0){
            System.out.println("entered number is multiple of three and even");
        }
        else{
            System.out.println("entered number is not multiple of three or even");
        }

    }
}
