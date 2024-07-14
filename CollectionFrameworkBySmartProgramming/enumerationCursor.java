package CollectionFrameworkBySmartProgramming;
import java.util.*;
public class enumerationCursor {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(12);
        v.add("ashok");
        v.add(12.43);

        System.out.println(v);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
    }
}
