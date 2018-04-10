package enumeration;

class Thread1 extends Thread implements Runnable {
    int  ticket=100;
    static Object obj=new Object();

    @Override
    public  void run() {
        while (true) {
            show();
        }
    }
        public synchronized void show(){
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                       Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(currentThread().getName() + "售票，票号为:" + ticket--);

                    }
                }
            }

    }

public class TestFor {
    public static void main(String[] args) {
        Thread1 p=new Thread1();
        Thread st1=new Thread(p);
       Thread st2=new Thread(p);
       Thread st3= new Thread(p);
       st1.setName("窗口1");
        st2.setName("窗口2");
        st3.setName("窗口3");
st1.start();
st2.start();
st3.start();


    }
}
