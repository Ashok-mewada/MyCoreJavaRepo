package CollectionFramework;
import java.util.*;
public class Linkedlistt {
    public static void main(String[] args) {
         LinkedList <Integer> LL1=new LinkedList<>(); 
         LinkedList <Integer> LL2 =new LinkedList<>(List.of(32,11,56,78,34,23));

         LL1.add(20);
         LL1.add(0,45);
         LL1.addAll(LL2);

         for(Integer x:LL1){
            System.out.print(x+",");
         }
    }
}
