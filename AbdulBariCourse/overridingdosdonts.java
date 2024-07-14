
/*// Lecture 132 do's AND dont's of overriding
// there are some rule for method overriding which explain by sir
// like access modifier use in method overriding which cobination is poswsible or which is not possible
class Super{
    private  void display()
    {
        System.out.println("Super Class Display");
    }
}
class sub extends Super{
   // @Override
    public void display()
    {
        System.out.println("Sub Clas Display");
    }
}
public class overridingdosdonts {
    public static void main(String[] args) {
        sub s=new sub();
        s.display();
    }
}
*/