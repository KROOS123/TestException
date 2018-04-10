package exercise.inputexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来

 */
public class TestList {
    public static void main(String[] args) {
        List list1=new ArrayList();
        Scanner s=new Scanner(System.in);
       for(int i=0;i<10;i++) {
           list1.add(s.nextInt());
       }
        //倒序输出
        Collections.reverse(list1);
        System.out.println(list1);

        //从大到小
        Collections.sort(list1);
       Collections.reverse(list1);
        System.out.println(list1);


    }

}
