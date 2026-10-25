package javaCollege;

public class HashMap {
    static void main(String[] args) {
        // HashMap  --stores Key and Value

//        diff HashMap -- for random order ,  tree map -- sorted order , linkedHashMap -- your import order    acc to key

//        Map<String,Integer> map = new HashMap<String,Integer>();
//        map.put("A", 2);
//        map.put("Z",1);
//        map.put("C",1);
//
//        System.out.println(map.get("C")); //System.out.println(map.getOrDefault("C"));
//
//        for(Map.Entry<String,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue()) ;
//        }


        //Question

//        String str = "jhfh+8+ujhhfg+5";
//        Map<Character, Integer> map = new TreeMap<Character,Integer>();  // u can choose linked or tree
//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//
//            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//           System.out.println(entry.getKey() + " " + entry.getValue()) ;
//
//            }
//        }

         // Some Methods in Hashmap

//        int arr[] = {687,5367,56738,32,4242,5,4};
//        Map<Integer , Integer> map  = new HashMap<Integer,Integer>();
//
//        map.put(100 , 4);
//        map.put(-300,-3);
//
//        System.out.println(map.containsKey(100));
//        System.out.println(map.containsValue(4));
//        int x = map.get(100);
//        int y = map.getOrDefault(200,555);
//
//        // unique key value is stored in Set
//        Set<Integer> vr = map.keySet();

        // frequency of number

//        int arr[] = {687,5367,56738,32,4242,5,5,4};
//        Map<Integer , Integer> map  = new HashMap<Integer,Integer>();
//        for(int n : arr){
//            int old = map.getOrDefault(n,0);
//            map.put(n,old+1);
//        }
//
//        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
//        for(Map.Entry<Integer,Integer> entry: entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


//        String str = "aaa aaa aaa fff fff qw qw qw re we df vc xs xs df df";
//        String [] arr = str.split(" ");   ----   // space se split karega ek string
//        System.out.println(Arrays.toString(arr));

        //frequency of Words using hashmap

//        String str = "aaa aaa aaa fff fff qw qw qw re we df vc xs xs df df";
//        String [] arr = str.split("\\s+");  // space se split karega ek string   here  (+) = quantifier  means space agar kitna bhi hoo vo bas split karde
//         System.out.println(Arrays.toString(arr));
//
//         Map<String, Integer> map = new HashMap<String,Integer>();
//         for(String st : arr){
//             map.put(st, map.getOrDefault(st,0)+1);
//         }
////         for(Map.Entry<String,Integer> entry:map.entrySet()) {
////             System.out.println(entry);  // just for print
////         }
//
//        int max = Integer.MIN_VALUE; // with max frequency word
//         String  word = "";
//         for(Map.Entry<String,Integer> entry : map.entrySet()){
//             if(max < entry.getValue()){
//                 max = entry.getValue();
//                 word = entry.getKey();
//             }
//         }
//        System.out.println(word + " " + max);
    }
}
