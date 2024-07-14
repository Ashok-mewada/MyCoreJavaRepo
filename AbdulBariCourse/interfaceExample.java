/* 
// Lecture 144 Demo for Interface Example
class Phone{
    public void call(){System.out.println("Phone call");}
    public void sms(){System.out.println("Phone sending sms");}
            }

interface ICamera
{
    void click();
    void record();
} 
interface IMusicPlayer
{
    void play();
    void stop();
}      
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall(){System.out.println("Smartphone video calling");}
    public void click(){System.out.println("Smartphone clicking Photos");}
    public void record(){System.out.println("SmartPhone recording video");}
    public void play(){System.out.println("Smartphone Playing Music");}
    public void stop(){System.out.println("SmartPhone Stop Playing Music");}
}   
public class interfaceExample {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.click();
        Phone p=new SmartPhone();
        p.call();
        p.sms();
    }
    
}
*/