package javaCollege;

import java.util.*;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        double price = 0;

        if (unit <= 100) {
            price = unit * 1;
        } else if (unit <= 200) {
            price = (100 * 1) + (unit - 100) * 2;
        } else {
            price = (100 * 1) + (100 * 2) + (unit - 200) * 3;
        }

        System.out.println("Total Bill: Rs " + price);
        sc.close();
    }
}
