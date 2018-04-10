package exercise;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFor {
    public static void main(String[] args){
        String[] str = new String[5];
        for(String myStr : str){
            myStr = "atguigu";
            System.out.println(myStr);
        }
        for(int i = 0;i < str.length;i++){
            System.out.println(str[i]);
        }
    }
}


//@Test
//    public  void test2(){
//    FileInputStream f1= null;
//
//    try {
//        f1 = new FileInputStream(new File(hello.txt));
//        int b;
//        while ((b = f1.read()) != -1) {
//            System.out.println((char) b);
//
//        }
//    }catch (FileNotFoundException e1){
//        System.out.println("文件未找到");
//    }catch (IOException e2){
//        System.out.println(e2.getMessage());
//    }finally {
//        try {
//            f1.close();
//        }catch (IOException e){
//           e.printStackTrace();
//        }
//    }
//}


//    @Test
//    public void test3() throws FileNotFoundException,IOException{
//        FileInputStream fil1=null;
//        fil1=new FileInputStream(new File(hello.txt));
//        int b;
//        while((b=fil1.read())!=-1 ){
//            System.out.print((char)b);
//        }
//
//        fil1.close();
//    }


