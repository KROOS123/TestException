package exercise.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestWorker {
    public static void main(String[] args) throws IOException {
        Person p1= new Person(12,"gui");
        Worker w1= new Worker(12,"kroos",99999.99,"Cto");
        FileInputStream fis = null;
        try {
            File file2= new File("txt.txt");
            fis = new FileInputStream(file2);
//        System.out.println(fis);
            int b= fis.read();
            while (b!=-1) {
                System.out.println(  (int)b);
                b=fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fis.close();
        }

    }
}
