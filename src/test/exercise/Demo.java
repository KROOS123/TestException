package test.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

class Demo {
    public static void main(String[] args) throws Exception{
        Properties pro =new Properties();

        pro.load(new FileInputStream(new File("jdbc.properties")));
        String user=pro.getProperty("user");
        System.out.println( user);
    }
}