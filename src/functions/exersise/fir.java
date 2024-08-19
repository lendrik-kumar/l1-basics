import java.util.Scanner;

public class fir {
    public static int average(int x, int y, int z) {
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

    System.out.println("The average is "+ average(x,y,z));


}
}