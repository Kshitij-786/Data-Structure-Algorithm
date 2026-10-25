package LB.Collection_Framework.Array;

import java.util.*;
public class Arrays_V3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// Sort binary num array --> Two pointer --> TC = O(n) & SC = O(1)
        //by collections.sort --> TC = O(nlogn) high
    /*    int arr[] = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0};
        int n = arr.length;
        int l = 0, r = n - 1;
        while ( l < r) {
            if (l<r) {
                if(arr[l] == 1 && arr[r] == 0 ){
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    r--;
                } else if (arr[r] ==1) {
                    r--;
                }
                else if (arr[r] == 0){
                    l++;
                }
            }
    }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }*/

        /// Missing Number --> XOR method sajna h abhii --> TC = O(n) & SC = O(1)
        //distinct elements

        /*int arr[] = {1,4,5,3,6};
        int missing = 0 ,n = arr.length;
        for (int i = 0;i<n;i++){
            missing = missing ^ arr[i];
        }
        for (int i = 0;i<n+1;i++){
            missing = missing ^ i;
        }
        System.out.println(missing);*/

        /// find unique element in array --> XOR --> TC = O(n) & SC = O(1)
        // every element occur 2 times but one no occurs 1 times
       /* int arr[] = {1, 0, 0, 1, 0, 1, 1, 0, 4,1, 0, 1, 0};
        int u = 0;
        for(int n:arr){ //har element ko process karna hiii h
            u = u^n;
        }
        System.out.println(u);*/
    }
}
