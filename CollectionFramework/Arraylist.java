package CollectionFramework;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> al1 =new ArrayList<>(20);
        ArrayList <Integer> al2 =new ArrayList<>(List.of(21,43,65,76));
        al1.add(20);
        al1.add(0,45);
        al1.addAll(al2);
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(43));

        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+",");
        }
         System.out.println("");
         System.out.println("By for each loop");
        for(Integer x:al1){
                System.out.print(x+",");
        }
            System.out.println();
            System.out.println("BY var args");
        for(var x:al1){
                System.out.print(x+",");
        }

        System.out.println("");
        System.out.println("Iterator concept");
         
        Iterator <Integer> it= al1.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
    }
}
