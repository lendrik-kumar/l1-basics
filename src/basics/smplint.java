import java.util.Scanner;

public class smplint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the principle : ");
        float x = scan.nextFloat();

        System.out.print("enter the interest : ");
        float y = scan.nextFloat();

        System.out.print("enter the time");
        float t = scan.nextFloat();

        float ans = ( x*y*t)/100;
        System.out.print("simpl int is : " + ans);
    }
}
