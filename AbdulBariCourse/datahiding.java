/* 
// Lecture 112 Practising of data hiding
class rectaangle{
    
    private double length;
    private double breadth;


    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
         breadth=b;
    }

     double area()
     { 
        return length*breadth;
     }
     double perimeter()
     {
        return 2*(length+breadth);
     }
     boolean square()
     {
        if(length==breadth)
        return true;
        else return false;
     }
    }


public class datahiding {
    public static void main(String[] args) {
        rectaangle r1=new rectaangle();
        r1.setLength(10.5);
        r1.setBreadth(5.5);

        System.out.println("Area of given rectangle is: " +r1.area());
        System.out.println("Perimeter of given rectangle is:"+r1.perimeter());
        System.out.println("is it a Square ???: "+r1.square());

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
    
}
*/
