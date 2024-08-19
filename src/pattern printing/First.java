import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i = 1; i<= x;i++ ){
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            int s = 2 *(x-i);
            for(int j = 1; j <= s;j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = x; i>0;i-- ){
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            int s = 2 *(x-i);
            for(int j = 1; j <= s;j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
   
    } 
}
