/* 
class Circle
{
public double radius;
public double area()
{
return Math.PI*radius*radius;
}
public double perimeter()
{
return 2*Math.PI*radius;
}
}
class Cylinder extends Circle
{
    public double heigth;
    public double volume()
    {
      return area()*heigth;

    }
}
public class InheritanceSimple {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.heigth=10;
       
        System.out.println("Volume of the Cylinder:"+c.volume());
        System.out.println("Area of Cylinder:"+c.area());
    }
}
*/