package LB.Collection_Framework.Theory;

import java.util.*;
public class hashSet {
    static void main(String[] args) {
        HashSet<Integer> hs  = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);

       // System.out.println(hs.size());

        Map<Integer, Integer> mp= new HashMap<>();
        mp.put(8,502);
        mp.put(9,504);
        mp.put(5,550);
        mp.put(4,150);

        System.out.println(mp.keySet());

        for(Map.Entry<Integer,Integer> map : mp.entrySet()){
            System.out.println("Keys: " + mp.keySet() + ", Values: " + mp.values());
        System.out.println(map);
        }


    }
}
