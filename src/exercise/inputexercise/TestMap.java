package exercise.inputexercise;
/*
2.请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。

 */

import java.security.PublicKey;
import java.util.*;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
public class TestMap {


    public static void main(String[] args) {


        Comparator con = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    return -(s1.getScore() - s2.getScore());
                }
                return 0;
            }

        };

//        Map map1 = new TreeMap(con);
//Map map1= new HashMap();
//        map1.put(1001,new Student(123, "kaka"));
//        map1.put(1002,new Student(130, "bale"));
//        map1.put(1003,new Student(113, "messi"));
//        map1.put(1004,new Student(138, "tql"));


//        for (int i = 1001; i <1004; i++) {
//
//
//            System.out.println(map1.get(i));
//        }



        Map<Student,Integer> map2=new TreeMap<Student,Integer>(con);
        map2.put(new Student(180,"luoluo"),2000);
        map2.put(new Student(190,"tiantian"),2001);
        map2.put(new Student(220,"cccccc"),2002);
        map2.put(new Student(300,"guigui"),2003);
        Set <Map.Entry<Student,Integer>> set1= map2.entrySet();
//        for(Map.Entry<Student,Integer> obj:set1 ){
//            System.out.println(obj);
//        }


        Set set2=map2.entrySet();
        List list=new ArrayList(set2    );
for(int i=0;i<3;i++){
    System.out.println(list.get(i));
}
Map map3 =new TreeMap(con);
        map3.put(new Student(1800,"sqwe"),3000);
        map3.put(new Student(1900,"sdfg"),3001);
        map3.put(new Student(2000,"jjjj"),3002);
        map3.put(new Student(2300,"kkkk"),3003);
        Set set3=map3.entrySet();
        List list2= new ArrayList(set3);
        for(int i=0;i<3;i++){
            System.out.println(list2.get(i));
        }


    }
}
