package testtreemap;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.Collections;

public class TestTreeMap {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put( new Customer(123,"aa",1001),12);
        map.put( new Customer(125,"gg",1002),11);
        map.put( new Customer(127,"ff",1003),13);
        Set set1=map.keySet();
//        Map map2 =new HashMap();
//        map2.put("kka",11);
//        map2.put("kaka",113);
//        map2.put("kaaaaka",11111);
//        for(Object m: map2.entrySet()){
//            System.out.println(map2.values());
//
//        }

//        遍历key值
        for(Object obj:set1){
            System.out.println(obj);
        }
        System.out.println();
        //遍历value值
        Collection c1= map.values();
        for(Object obj:c1){
            System.out.println(obj);
        }
        System.out.println();
        Set set2= map.entrySet();
        for(Object obj:set2) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"----->"+entry.getValue());
//            System.out.println(entry);
        }
    }
}
