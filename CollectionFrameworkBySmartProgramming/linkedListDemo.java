package CollectionFrameworkBySmartProgramming;

import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
     LinkedList ls=new LinkedList();
     ls.add(335);
     ls.add("hfg");
     ls.add(7897);
     ls.add(4535);
     ls.add(null);
    
     System.out.println(ls.hashCode());
     ls.addFirst(455456);
     System.out.println(ls.get(3));
     System.out.println(ls);
     
    }
}
