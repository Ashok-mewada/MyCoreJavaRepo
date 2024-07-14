// Lecture no.183:Demo on Multithreading using Thread and Runnable
// First program of Thread
// And We can Use same class for Multithtrading also
// We made the so The Program will Work Simiulteneously
/* 
class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
*/
/* 
// This is the Exam of Runnable for MultiThreading 
class MuyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {

        MuyRunnable m=new MuyRunnable();
        Thread th=new Thread(m);
        th.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
*/
