// Lecture 124 Parameterised Constructor in inheritance
/* 
class Parent{
Parent()
{
    System.out.println("Non Param of Parent");
}

Parent (int x)
{
System.out.println("Param of Parent"+x);
}
}
class Child extends Parent{

    Child()
    {
        System.out.println("Non Param of Child");
    }
  Child (int y)
  {
    System.out.println("Param  of Child");
  }
  Child(int x,int y)
  {
    super(x);
    System.out.println("2 Param of Child"+y);
  }
}

public class paraconstructinher {

public static void main(String[] args) {
    Child c=new Child(10,20);
}
    
}

// Another Example of parameterised constructor 
class Rectangle{
    int length;
    int breadth;
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }

}
class Cuboid extends Rectangle{
    int height;
    Cuboid()
    {
        height=1;
    }
    Cuboid (int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        // super is used for call the parameterised constructor from the child constructor
        super(l,b);
        height=h;
    }
    int volume()
    {
        return  length*breadth*height;
    }
}
public class paraconstructinher {

    public static void main(String[] args) {
        Cuboid c=new Cuboid(5,3,10);
        System.out.println("Volume of Cuboid:"+c.volume());
    }
    }
    */