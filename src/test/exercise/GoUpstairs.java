package test.exercise;

import java.util.*;


public class GoUpstairs {
    public static void main(String[] args) {
        GoUpstairs go1=new GoUpstairs();
//        go1.countWays(3);
        System.out.println(go1.countWays(5));
    }
    public int countWays(int n) {
        if (n == 0) {
            return 0;
        }
        long[] result = new long[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] %1000000007+ result[i - 2]%1000000007;
        }
        return (int)(result[n] % 1000000007);
    }
}
