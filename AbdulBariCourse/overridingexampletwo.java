/* 
// Lecture 129....Example 2
// Example of method overriding 
class Car{
    public void start()
    {
        System.out.println("Car Started");
    }
    public void accelerate()
    {
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car gear Changed");
    }
}
class LuxuryCar extends Car{
    public void start()
    {
        System.out.println("Car Started");
    }
    public void accelerate()
    {
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openroof()
    {
        System.out.println("Sun roof is open");
    }
}
    


public class overridingexampletwo {
    public static void main(String[] args) {
        LuxuryCar c=new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openroof();
    }
    
}
*/
