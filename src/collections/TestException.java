package collections;
/*
在main方法中使用try、catch、finally，要求：
在try块中，编写被零除的代码。
在catch块中，捕获被零除所产生的异常，并且打印异常信息
在finally块中，打印一条语句。

 */

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try{

            Scanner s=new Scanner(System.in);
            int a1=s.nextInt();
            int a2=s.nextInt();
            double b=a1/a2;

        }catch (ArithmeticException e1){
            System.out.println("除数不能为0");

        }finally {
            System.out.println("结束");
        }
    }

}
