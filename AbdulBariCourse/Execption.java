// Lecture 168 : try and Catch block for Exception Handling
public class Execption {
    public static void main(String[] args) {
        /* 
        int a=10,b=0,c;

        try
        {
            c=a/b;
             System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator should not be 0,try again "+e);
        }
        System.out.println("Bye");
        */

       // Lecture 169: multiple and Nested try and catch
       /* 
       int A[]={30,20,10,40,0};

       try
       {
        int c=A[0]/A[2];
        System.out.println("Division is "+c);

        System.out.println(A[5]);
       }
       catch (ArithmeticException e)
       {
        System.out.println("Denominator should not be 0");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("Index is Invalid "+e);
       }
       System.out.println("Bye");
       */
       // Nested try and catch block
       int A[]={30,20,10,40,0};

       try
       {
          int c=A[0]/A[2];
          System.out.println("Division is "+c);
        
          try 
          {
           System.out.println(A[5]);
          }
          catch(ArrayIndexOutOfBoundsException e)   
          {
           System.out.println("Index is Invalid "+e);
          }
       }
        catch (ArithmeticException e)
       {
        System.out.println("Denominator should not be 0");
       }
     
       System.out.println("Bye");
       
    }
}
