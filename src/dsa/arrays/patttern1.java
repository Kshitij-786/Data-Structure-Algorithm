package javaCollege;

import java.util.*;
public class patttern1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }    // Two Different Direction pattern
            System.out.println();
        }
        for(int i = 1; i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
