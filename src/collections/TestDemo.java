package collections;
import javax.xml.soap.SOAPBody;
import java.util.*;
import java.util.Set;
import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(123);
        list.add("abc");
        list.add("swed");
        System.out.println(list.indexOf("abc"));
        Set set1 =   new TreeSet();
        set1.add("AA");
        set1.add("DD");
        set1.add("gg");
        System.out.println();
        for(Object obj1:set1){
            System.out.println(obj1);
        }
        System.out.println();
        TreeSet set2= new TreeSet();
        set2.add("AA");
        set2.add("DD");
        set2.add("gg");
        for(Object obj2:set2){
            System.out.println(obj2);
        }
    }
}
