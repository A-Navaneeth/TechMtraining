import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibnocci {
    static Map<Integer,Long> mp=new HashMap<>();
    public static long fib(int n){
        if(n==0 || n==1){
            return n;
        }
        if(mp.containsKey(n)){
            return mp.get(n);
        }
        long res=fib(n-1)+fib(n-2);
        return res;
    }
    public static long Tabulation(int n){
        
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

        
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println(Tabulation(n));


    }
}
