package test.exercise;

public class ReturnExceptionDemo {
    public  int aaa(){
        int x=1;

        try{
             ++x;
        }catch(Exception e){

        }finally{
            ++x;
            return x;
        }
        //System.out.println("atguigu");

    }

    public static void main(String[] args) {
       ReturnExceptionDemo t= new ReturnExceptionDemo();
        int y=t.aaa();
        System.out.println(y);
    }
}
