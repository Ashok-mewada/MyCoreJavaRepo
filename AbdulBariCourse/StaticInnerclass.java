/* 
// Lecture 152 Demo on Inner Clsses 
// This is Example of Static Inner Class
class Outer
{
    int x=10;
    static int y=20;
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    } 

}
public class StaticInnerclass {
    public static void main(String[] args) {
        Outer.My m=new Outer.My();
        m.show();
    }
}
*/