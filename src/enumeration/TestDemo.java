package enumeration;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class TestDemo {

        /**
         * 请完成下面这个函数，实现题目要求的功能
         * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来
         *
         * @param a 贷款金额
         * @param i 年利率
         * @param n 贷款期限 假设n为年
         * @return 月还款额，保留2位小数，向上舍入
         */
        static double calculate(int a, double i, double n) {
            //b为总还款额
double b= (a+a*i)*Math.pow((1+i),n-1);
double monthly= (b/12/n);
return monthly;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            double res;

            System.out.println("请出入贷款金额(正整数):");
            int _a;

            _a = Integer.parseInt(in.nextLine().trim());

            System.out.println("请输入年利率(如:4.35)%:");
            double _i;
            _i = Double.parseDouble(in.nextLine().trim());

            System.out.println("请输入贷款期限多少年:");
            int _n;
            _n = Integer.parseInt(in.nextLine().trim());
            System.out.println();
            res = calculate(_a, _i, _n);
            BigDecimal res1= new BigDecimal(res);
            double res2 = res1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(res2);


        }
    }
