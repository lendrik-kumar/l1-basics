

import java.util.Scanner;

public class main1 {
    public static int sum(int x,int y) {
        int ans = 0;
         if(x>y) ans = x;
         if(y>x) ans = y;
         
         return ans;
     }
    public static int gcd(int x,int y) {
        for(int i = 2;i <= sum(x,y);i++){
            if(x%i == 0 && y%i == 0){
                return i;
            }
        }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

System.out.println("the greatest common divisor is" + gcd(x,y));
    }
}
