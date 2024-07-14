// Lecture 116 [Student challange] Cylinder program using constructor
/* 
class cylinderr
{
    private int radius;
    private int height;
    public int getRadius()
    {
        return radius;
    }
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int r)
    {
       if (r>=0) radius=r;
       else radius=0;
    }
    public void setHeight(int h)
    {
        if(h>=0)
        height=h;
        else h=0;
    }
    public void setDimensions(int r,int h)
    {
        radius=r;
        height=h;
    }
    public cylinderr()
    {
    radius=1;
    height=1;
    }
    public cylinderr(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int lidArea()
    {
        return (int )Math.PI*radius*radius   ;
    }
    public int  totalSurfaceArea()
    {
        return (int) 2*lidArea()+circumference()*height;      
    }
    public int volume()
    {
        return      lidArea()*height  ;
    }
    public int circumference()
    {
     return   2*(int)Math.PI*radius; 
    }
}

public class constructcylinder {
    public static void main(String[] args) {
        cylinderr c=new cylinderr(5,6);
        System.out.println(c.lidArea());
        System.out.println(c.circumference());
        System.out.println(c.totalSurfaceArea());
        System.out.println(c.volume());
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
    }
    
}
*/