import java.util.Scanner;

public class sum {
     public static int sum(int a,int b) {
        int ans = a + b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a");
        int x = scan.nextInt();
        System.out.print("b");
        int y = scan.nextInt();
        
        int s =  sum(x,y); ;
        System.out.println("the sum is" + s);
    }
    
}
