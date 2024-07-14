/* 
// Lecture 156:Demo on Static Block 
// its is used when the class is load
class Test
{
    static
    {
        System.out.println("Block1");
    }
    static
    {
        System.out.println("Block2");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
      
      System.out.println("Main");  
      Test t=new Test();
    }
    static
    {
        System.out.println("Block first");
    }
}
*/