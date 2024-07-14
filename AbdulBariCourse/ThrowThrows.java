// Lecture no.173: denmo on a throaw and throws 
class negativeDimesionException extends Exception 
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
} 
public class ThrowThrows {
    static int area (int l,int b) throws negativeDimesionException
    {
        if(l<0||b<0)
         throw new negativeDimesionException ();
         return l*b;
    }
    static void meth1() throws negativeDimesionException
    {
        System.out.println("Area is:"+area(-10,5));
    }   
    public static void main(String[] args) {
        try{
            meth1();
        }
        catch ( negativeDimesionException e)
        {
            System.out.println(e);
        }
    }
}
