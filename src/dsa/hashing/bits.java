package LB.Collection_Framework.Theory;

public class bits {
    static void main(String[] args) {

        /// number is in power of two or not --> Brute force --> TC = O(logn) & SC = O(1)
        /// Agar set bit (1) ka count 1 se jayada h toh power of two nhi h
        /*int n = 7;
        int count = 0;
        while(n !=0){ //ek time mein jab shift karenge toh zero hoga na islye
            if((n & 1) != 0){ //set bit mil gyi
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);*/

        /// number is in power of two or not --> Formula based --> TC = O(1) & SC = O(1)
        /*int n = 8;
        if((n & (n-1)) == 0){ // n & (n-1) se last set bit remove h
            System.out.println("Yes");
        }
        else System.out.println("No");*/

        /// swap number variables using XOR --> TC = O(1) & SC = O(1)
        /*int a = 4;
        int b = 3;

        a = a^b; // 4 ^ 3
        b = a^b; // (4^3)^3 == so 3 cancels and b = 4 left
        a = a^b; // (4^3)^ (4^3)^3 == (4^3)cancels and a = 3 left

        System.out.println(a  +" and " + b );*/

        /// Unique element in list --> TC = O(1) & SC = O(1)
     /*   int a = 15;
        int b = 2;
        int c = 15;
        int d = 4;
        int e = 2;

        int n = a^b^c^d^e;

        System.out.println(n);
*/

        /// remove last set bit --> as upar dekha --> TC = O(1) & SC = O(1)
        /*int n = 10;
        n= n  & (n-1);
        System.out.println(n);*/

        /// get last set bit --> formula based --> TC = O(1) & SC = O(1)
        /*int n = 10;
        n = n & (-n); //2's complement of n then operation AND
        System.out.println(n);*/

    }
}
