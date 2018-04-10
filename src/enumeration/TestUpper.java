package enumeration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestUpper {
    public static void main(String[] args) {
      BufferedReader br =null;
        try {
            InputStream is =System.in;
            InputStreamReader isr= new InputStreamReader(is);
            br =new BufferedReader(isr);
            String str;
            while(true){
                System.out.println("请输入字符串");
                str=br.readLine();
                if
                    (str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit"))
                {
                    break;
                }
                String str1=str.toUpperCase();
                System.out.println(str1 );
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( br !=null) {
              try {
                  br.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
            }
        }

    }
}
