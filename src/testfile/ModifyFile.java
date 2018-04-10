package testfile;

import java.io.FileReader;
import java.io.IOException;

public class ModifyFile {
    public static void main(String[] args) throws IOException {
        FileReader file1=null;

        try {
            file1 = new FileReader("/Users/siyuzhou/Desktop/dir2/test.txt");
            char[] ch = new char[1024];
            int len = 0;
            while ((len = file1.read(ch)) != -1) {
                System.out.println(new String(ch, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file1.close();
        }

    }
    }

