package javaCollege;

import java.util.Arrays;

public class reverseArray {
    static void main(String[] args) {

        // my approach -- two pointer
//        int arr[] = {10, 20, 30, 40, 50};
//        int temp;
//        for (int i = 0; i < arr.length / 2; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

         // sir way
        int nw[] = {10, 20, 30, 40, 50};
        int dum[] = new int [nw.length];
        for(int i = 0;i< nw.length;i++){
            dum [i] = nw[nw.length-1 -i];
        }
        System.arraycopy(dum , 0 , nw,0, nw.length);  // copy array
        System.out.println(Arrays.toString(nw));
    }
}