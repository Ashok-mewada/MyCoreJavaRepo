/* *
// Lecture 152 Demo on Local ,Static and Anonymous Inner Class 
// This is Example of Local Inner Class
class Outer 
{
    public void display()
    {
        class Inner 
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        i.show();
    }
}


public class Localinnerclass {
     public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
     }    
}
*/