

import java.util.Scanner;


public class sec {
    public static int sum(int x) {
        int ans = 0;
        for(int i =0; i<= x;i++){
            if(i%2!=0) ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();

    System.out.println("The sum is "+ sum(x));


}
}
