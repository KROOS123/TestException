package exercise.exercise1;

/*
编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
	对数据类型不一致(NumberFormatException)、
	缺少命令行参数(ArrayIndexOutOfBoundsException、
  	除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异常处理。
提示：
	(1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
	(2)在main()方法中使用异常处理语句进行异常处理。
	(3)在程序中，自定义对应输入负数的异常类(EcDef)。
	(4)运行时接受参数 java EcmDef 20 10
		//args[0]=“20” args[1]=“10”
	(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。
	如int a=Interger.parseInt(“314”);	//a=314;

 */

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        try {
         Scanner s=new Scanner(System.in);
         int b1=s.nextInt();
            int b2=s.nextInt();
            ecm(b1, b2);
        }catch (ArrayIndexOutOfBoundsException e4){
            System.out.println("缺少命令行参数");
        }
        catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }
        catch (ArithmeticException e3){
            System.out.println("除数不能为0");
        }
        catch (EcDef e1){
            System.out.println(e1.getMessage());
        }
    }

    public static void ecm(int a1,int a2)throws EcDef{
       if(a1<0||a2<0) {throw new EcDef("您输入的数异常");
       }
       else {
           System.out.println(a1/a2);
       }



    }
}
//自定义异常类
class EcDef extends Exception{
    static final long serialVersionUID = -3387514229948L;

    public EcDef(String message) {
        super(message);
    }

    public EcDef(){

    }
}

