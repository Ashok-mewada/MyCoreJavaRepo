package CollectionFrameworkBySmartProgramming;
import java.util.*;
public class listiteratordemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(12);
        l.add("rajput");
        l.add(243);

        System.out.println(l);
        ListIterator itr=l.listIterator();
        
        itr.next();
        itr.next();
        itr.next();
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}

