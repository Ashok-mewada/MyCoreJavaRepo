/* 
// Lecture 152 Demo on Local , Anonymous and Static Inner Classes
// This is Example of Anonymous Inner Class
// We can use Interface in  the Place of abstract class
abstract class My
{
    abstract public void show();
}
class Outer
{
    public void display()
    {
        My m=new My() {public void show(){System.out.println("Hello");}};// Anonymous class
        m.show();
    }
}
public class AnonymousInnerclass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
    
}
*/