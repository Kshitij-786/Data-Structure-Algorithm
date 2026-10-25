package javaCollege;

import java.util.*;
public class divisorOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  approach 1 to get divisor of number
            int  n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 1;i<=n;i++){
                if(n%i==0) {

                    list.add(i);//array list   and diff set vs list
                }
            }
                System.out.println(list);
            System.out.println();


                // approach 2
//
//            int num  = sc.nextInt();
//            List<Integer> list = new ArrayList<>();
//
//        for(int i= 1;i*i<=num;i++){
//                if(num%i==0){
//                    list.add(i);
//                }
//                if(num%i!=0){ //             avoid duplicate when i == n/i (like for perfect squares) want to learn
//                    list.add(num/i);
//                }
//            }
//        System.out.println(list);
    }
}
