// Lecture No.188:Thread Daemon,Join and Yield
// Remaining Method after the Lecture of 187
class Mythread1 extends Thread{
   
    public void run()
    {
        int count =1;
        while(true)
        {
            System.out.println(count++ +"My Thread");
        }
    }
}
public class ThreadMethods2 
{
    public static void main(String[] args) throws Exception
    {
        Mythread1 t=new Mythread1();
       // t.setDaemon(true);
        t.start();
       //This Is used for Daemon:// try{Thread.sleep(100);}catch(Exception e){}
       //  Thread mainThread=Thread.currentThread();
       //   mainThread.join();
       int count =1;
       while(true)
       {
           System.out.println(count++ +"Main");
           Thread.yield();
       }
    }
}
