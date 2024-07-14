
// Lecture no.159 Demo on Singleton Class
class CoffeeMachine
{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()
    {
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }

    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public float getCoffee()
    {
    return 0.23f;
    }

    static CoffeeMachine getInstance()
    {
        if(my==null)
          my=new CoffeeMachine();
        return  my;
    }
   
}
public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        System.out.println(m1+" "+m2);
        if(m1==m2)
        {
            System.out.println("Same");
        }
    }
    
}

