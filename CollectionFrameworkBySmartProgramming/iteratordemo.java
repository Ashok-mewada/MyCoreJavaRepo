package CollectionFrameworkBySmartProgramming;
import java.util.*;
public class iteratordemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(12);
        l.add("rajput");
        l.add(243);

        System.out.println(l);
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
