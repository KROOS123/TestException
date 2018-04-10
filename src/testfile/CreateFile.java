package testfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File dir1 =new File("/Users/siyuzhou/Desktop/");
        if(!dir1.exists()){
            dir1.mkdir();
        }
        File dir2=new File(dir1,"dir2");
        if(!dir2.exists()){
            dir2.mkdir();
        }
        File file1=new File(dir2,"test.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
    }
}
