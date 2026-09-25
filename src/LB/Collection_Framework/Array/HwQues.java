package LB.Collection_Framework.Array;

import java.util.*;
public class HwQues {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// Swap alternate elements in Array --> TC = O(n) & SC = O(1)
        //123456 --> 214365

      /*  int arr[] = {1,2,3,4,5,6};
        for(int i = 0;i< arr.length;i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }*/

        /// Print Common elements of Two Array --> TC = O(n.m) & SC = O(min(n,m))
      /*  int arr[] = {10,2,3,4,5,6}; //index does not matter
        int arrr[] = {4,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j< arrr.length;j++){
                if(arr[i] == arrr[j]){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);*/


        ///Shift Array by k position --> TC = O(k.n) & SC = O(n)
        /*int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
            int arr[] = {1, 2, 3, 4, 5, 6};
            int n = arr.length;
        for (int j = 1; j <= k; j++) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
            for (int i = 0; i < n; i++) {
                list.add(arr[i]);
            }
        System.out.println(list);
    }
}