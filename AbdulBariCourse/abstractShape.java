/* 
// Lecture 138 [Student Challange]
// Student Challange for abstract Class
abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
      }
  class Circle extends Shape{
  public  double  radius;
 public double perimeter()
 {
    return 2*Math.PI*radius;
 }
 public double area()
 {
    return Math.PI*radius*radius; 
 }
}
class Rectangle extends Shape{
double length;
double breadth;
public double perimeter()
{
    return 2*(length+breadth);
}
public double area()
{
return length*breadth;
}
}
public class abstractShape {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=5;
        r.breadth=10;
        Shape s=r;
        System.out.println(s.area());
    }
    
}
*/