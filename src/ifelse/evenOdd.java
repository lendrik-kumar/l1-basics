package ifelse;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the principle : ");
        int x = scan.nextInt();

        if(x%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
