package javaCollege;

public class recursion {

    static int r(int a,int b) {
        if ( b == 0) {
            return a;
        }
        if ( a == 0) {
            return b;
        }

        int count = 0;
        return r(b,a%b);
    }
    static void main(String[] args) {

       int result = r(48,18);
        System.out.println(result);

    }
}
