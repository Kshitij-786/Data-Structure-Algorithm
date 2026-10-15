package dsa;

import java.util.*;
public class temp {
static void table2(){
    for (int i = 1;i<=10;i++){
        int ans = 2*i;
        System.out.println("2 * " + i + " = " + ans);
    }
}
static void sum_and_diff(int x ,int y){
    int sum = x+y;
    System.out.println("Sum: " + sum);
    int diff = x-y;
    System.out.println("Diff: " + diff);
}

static String check(String  x , String y){
    String ans  = x+y;
    return ans;
}

/// Main method
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Here is call");
        table2();
         System.out.println("here is your sum and diff");
         sum_and_diff(sc.nextInt(),sc.nextInt());*/
         String result = check("10","15");
         System.out.println(result);
    }
}

