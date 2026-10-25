package javaCollege;

import java.util.*;
public class seriesEquation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.
        /*long n = sc.nextLong();
        double sum = 0;
        for (int i = 1;i<=n;i++){
             sum = (n*(n+1))/2;

        }
        System.out.println(sum);*/

        //2.
        long n = sc.nextLong();
        double sum = 0;
        for(int i = 2;i<=n;i+=2){
            if(i%2 == 0){
                sum = n*(n+1);
            }
        }
        System.out.println(sum);
    }
}
