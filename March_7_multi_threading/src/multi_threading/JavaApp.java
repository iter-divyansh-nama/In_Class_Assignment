package multi_threading;

public class JavaApp {

    public static void execution() {
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();
    	
    	
    	MyThread2 myThread2 = new MyThread2();
    	Thread thread = new Thread(myThread2);
    	thread.start();
    }
}