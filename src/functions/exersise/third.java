

import java.util.Scanner;

public class third {
     public static int sum(int x,int y) {
       int ans = 0;
        if(x>y) ans = x;
        if(y>x) ans = y;
        
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();
       int y = sc.nextInt();

    System.out.println("The maximum is "+ sum(x,y));


}
    
}
