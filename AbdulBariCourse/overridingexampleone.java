/* 
// Lecture 128 Example of method overriding
// Example 1
class TV{
    public void swithON()
    {
        System.out.println("TV is switched ON");
    }
    public void changeChannel()
    {
        System.out.println("TV Channel is changed");
    }
}
class SmartTV extends TV{
@Override
public void swithON()
{
    System.out.println("SmartTV is switched ON");
}
@Override
public void changeChannel()
{
    System.out.println("SmartTV Channel is changed");
}
public void browse(){
    System.out.println("SmartTv Browsing ");
}

}
public class overridingexampleone {
    public static void main(String[] args) {
        TV t=new TV();
        t.swithON();
        SmartTV st=new SmartTV();
        st.browse();
    }
}
*/
