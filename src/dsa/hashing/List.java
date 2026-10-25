package LB.Collection_Framework.Theory;

import java.util.*;

public class List {
    static void main(String[] args) {
////        ArrayList<String> list = new ArrayList<>();
////        list.add("10");
////        list.add("50");
////        list.add("70");
//
//    //  Iterator<String> it = list.iterator();
////        System.out.println(it.next());
//
//      //  while(it.hasNext()){ /// jab tak list me elements hai
//           // System.out.println("Elements: " + it.next()); ///tab tak print kardoo
//
//
//        /// Specific method of List
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(500);
//        arr.add(82);
//        arr.add(9);
////        System.out.println(arr);
////        arr.set(2,56);
////        System.out.println(arr);
////
////        System.out.println(arr.contains(10));
//
//        /// sort a list
//        Collections.sort(arr);
//        System.out.println(arr);
//
//       ArrayList<Integer> newlist =(ArrayList<Integer>)arr.clone();
//        System.out.println(newlist);
//        System.out.println(newlist.isEmpty());
//
    /// Linked List

    LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(15);
        list.add(50);
        list.add(99);
        list.add(45);
        System.out.println(list);
//        System.out.println(list.lastIndexOf(50));
//        System.out.println(list.poll());
//        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(list.poll());
            System.out.println(list.size());
        }
        System.out.println(list);
    }
}
