
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" -count "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

public class RunnableDemo {
    public static void main(String[] args){
        MyRunnable r1=new MyRunnable();
        MyRunnable r2=new MyRunnable();
        MyRunnable r3=new MyRunnable();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
