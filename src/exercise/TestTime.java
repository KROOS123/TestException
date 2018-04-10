package exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTime {
    public static void main(String[] args) {
printTime(100000,50000,30003 );

    }


    public static void printTime(int len,int num,int index) {
        //定义数组arr和链表link
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> link = new LinkedList<Integer>();
        //为数组和链表赋予初始值
        for (int i = 0; i < len; i++) {
            arr.add(i);
            link.add(i);
        }
        //计算为数组插入数据的时间
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            arr.add(index,3);
        }
        long overTime1=System.currentTimeMillis();
        System.out.println("数组插入数据所经历的时间："+(-(startTime1-overTime1)));
        //计算为链表插入数据的时间
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            link.add(index,8);
        }
        long overTime2=System.currentTimeMillis();
        System.out.println("链表插入数据所经历的时间："+(-(startTime2-overTime2)));
    }
}
