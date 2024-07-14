/* 
// Lecture 153 :Demo on Static Members Simple Practice 
class HondaCity
{
    static long price=122;
    int y=12;
    static double onRoadPrice(String city)
    {
        switch (city)
        {
            case "Delhi":
            return price*price*0.1;
            case "Mumbai":
            return price*price*0.9;
        }
        return price;
    }
}
public class StaticMembers {
    public static void main(String[] args) {
        System.out.println(HondaCity.onRoadPrice("Delhi"));
       
    }
    
}
*/