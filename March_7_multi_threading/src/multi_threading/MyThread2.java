package multi_threading;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("My Thread2: " + i);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
