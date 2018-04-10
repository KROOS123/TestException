package treeandexercise;

import java.util.*;

import org.junit.Test;
public class TestTreeSet  {
    public static void main(String[] args) {


        Comparator con = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate birth1 = e1.getBirthday();
                    MyDate birth2 = e2.getBirthday();
                    if (birth1.getYear() != birth2.getYear()) {
                        return birth1.getYear() - birth2.getYear();
                    } else {
                        if (birth1.getMonth() != birth2.getMonth()) {
                            return birth1.getMonth() - birth2.getMonth();
                        } else {
                            return birth1.getDay() - birth2.getDay();
                        }


                    }
                }
                return 0;
            }

        };
        TreeSet set1 =new TreeSet(con);
        Employee e1=new Employee("刘德华",23,new MyDate(21,6,1994));
        Employee e2=new Employee("郭小狗",20,new MyDate(11,6,1997));
        Employee e3=new Employee("PDD",23,new MyDate(21,8,1994));
        Employee e4=new Employee("鸿门宴",30,new MyDate(14,3,1988));
        Employee e5=new Employee("门牙徐",21,new MyDate(21,6,1996));

        set1.add(e1);
        set1.add(e2);
        set1.add(e3);
        set1.add(e4);
        set1.add(e5);
      Iterator i=set1.iterator();
      while(i.hasNext())
      {
          System.out.println(i.next());
      }


        System.out.println();
      Set set3= new HashSet();
      set3.add(new Employee("aa",123,new MyDate(23,11,1876)));
        set3.add(new Employee("cc",122,new MyDate(13,5,1999)));
        set3.add(new Employee("dd",121,new MyDate(17,7,1890)));
Iterator iterator =set3.iterator();
while(iterator.hasNext()){
    System.out.println(iterator.next());
}




//
    }
}
