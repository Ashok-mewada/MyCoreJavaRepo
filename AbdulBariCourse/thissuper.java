// Lecture 125 this and Superkeyword
/* 
 class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    void display()
    {
        System.out.println("Length:"+this.length);
        System.out.println("Breadth:"+this.breadth);
    }
 }
public class thissuper {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,12);
        r.display();
    }
}
    

    class Rectangle{
        int length;
        int breadth;
        int x=10;

        Rectangle(int length,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
    
        }
        
     }
     class Cuboid extends Rectangle
     {
        int height;
        int x=20;
        Cuboid(int l,int b,int h)
        {
            super(l,b);
            height=h;
        }
        void display()
        {
            System.out.println(super.x);
            System.out.println(x);
        }
     }
    public class thissuper {
        public static void main(String[] args) {
            Cuboid c1=new Cuboid(10,5,17);
            c1.display();
        }
    }
    */