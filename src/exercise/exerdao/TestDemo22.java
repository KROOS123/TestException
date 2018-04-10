package exercise.exerdao;

import java.util.Scanner;

public class TestDemo22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //从键盘上输入n（n为数组长度）
         int n=s.nextInt();
         //初始化定义结果和为0；
         int sum=0;
         //创建目标数组，数组长度为n
        int[] a1=new int[n];
        //循环求出数组和
        for(int i=0;i<n;i++){
            a1[i]=(1+(i+1))*(i+1)/2;
//            System.out.println("a"+(i+1)+"="+a1[i]);
            sum=sum+a1[i];
        }
        //打印数组和
        System.out.println(sum);
    }
}
