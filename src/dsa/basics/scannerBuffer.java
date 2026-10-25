package javaCollege;

import java.util.*;
public class scannerBuffer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        String name = sc.next();
        // nextInt ya next ke baad code input nhi leta h isliye ye use kara hai...
        sc.nextLine();
        String add = sc.nextLine();
        System.out.println(pin);
        System.out.println(name);
        System.out.println(add);
    }
}
