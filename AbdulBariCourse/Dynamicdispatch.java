/* 
// Lecture 131 Practising Dynamic method Dispatch
class Super{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}
class sub extends Super{
    @Override
public void meth2()
{
    System.out.println("sub meth2");
}
public void meth3()
{
    System.out.println("sub meth3");
}

}
public class Dynamicdispatch {
    public static void main(String[] args) {
        // Reference of super class and object of sub class it is the concept of dynamic method dispatch 
       Super sup=new sub();
       sup.meth1();
       sup.meth2();
    
    }
}
*/