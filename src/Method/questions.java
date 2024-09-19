package Method;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean ans = isPrime(a);
//        System.out.println(ans);
//        System.out.println(isPrime(a));
        for(int i = 100; i < 1000; i++){
          if(Armstrong(i)){
              System.out.print(i+ " ");
          }
        }
    }

    //Armstrong numbers
    static boolean Armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            sum = sum + remainder * remainder * remainder;
        }
//        if (sum == original){
//            return true;
//        }
//        return false;
        return sum == original;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
//        if (c * c > n){
//            return true;
//        }
//        return false;
        return c * c > n;
    }
}
