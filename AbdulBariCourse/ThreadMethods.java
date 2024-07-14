// Lecture no 187:Thread Methods :Constructors ,Sleep and Interruot
// it is demo on Thread Class and Method of Thread  
class Mythread extends Thread{
    public Mythread (String name)
    {
        super (name);
       // setPriority(Thread.MAX_PRIORITY);
    }
    public void run()
    {
        int count =1;


        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadMethods  
{
    public static void main(String[] args) throws Exception
    {
        Mythread t=new Mythread("My Thread 1");
        t.start();
        t.interrupt();
        /* 
        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
        */
        
    }
}
