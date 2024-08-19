package loops;

import java.util.Scanner;

public class nmbrzSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ans ,sum = 0;

        for(int i = 0 ; 1==1 ; i++){
            System.out.println("enter the term");
             ans = scan.nextInt();
          if(ans == -1) {
              break;
          }
          sum += ans;
        }
        System.out.println("sum is" +sum);

    }
}
