package CollectionFramework;

import java.util.HashSet;

public class Hashsett {

    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        
        hs.add(130);
        hs.add(20);
        hs.add(90);
        hs.add(10);
        
        System.out.println(hs);
    }
    
  }

