package testfile;
/*
往文件（文本中）加入字符，若不存在，则新建。
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputandOutput {
    public static void main(String[] args) throws IOException {
        //新建一个文本文件
        File file1 = new File("txt2.txt");
        FileOutputStream fos1 = null;

        try {
            fos1 = new FileOutputStream(file1);
            //写入字符串
            fos1.write(new String("moshangpuruyu").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos1 != null) {
                try {
                    fos1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}