package LB.Collection_Framework.Array;

import javax.swing.*;
import java.util.*;
public class Arrays_V2 {
    static void main(String[] args) {

        /// Reverse Array --> two pointer --> TC = O(n) & SC = O(1)
       /* int arr[] = {1,2,3,4,5,6}; //waise toh tc n/2 + n hoona h par constant remove
        int n = arr.length;
        int l = 0, r = n-1;

        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int i = 0;i<n;i++){ // kuch had tak array list mai hai
        ArrayList<Integer>list = new ArrayList<>();
        list.add(arr[i]);
            System.out.print(list);
        }
*/

        /// Shift Array by 1 position --> Store one value in temp --> TC = O(n) & SC = O(1)
        /*int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int temp = arr[n-1];
        for( int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
            arr[0] = temp;
        for( int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();*/

        /// Print Alternate Extreme of Array -->Two Pointer --> TC = O(n) & SC = O(1)
        //phele frst index phir last index then after fisrt and then before last ---same
     /*   int arr[] = {1,3,5,4,2};
        int n = arr.length;
        int i = 0, j = n-1;
       while(i<j+1){
           if(i==j){
               System.out.println(arr[i]);
               break;
            }
           else {
               System.out.println(arr[i]);
               i++;
               System.out.println(arr[j]);
               j--;
           }
        }*/

        /// Mode of Number --> Hash Map --> TC = O(n) & SC = O(n)

        int arr[] = { 1,3,3,5,6,7,5,5,5,3,1,8,2}; //1-2,3-3,5-3,6,7,8,2-1
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1); //freq nikalne ka badiya tarika
        }
            System.out.println(map.entrySet());
        int maxfreq = Integer.MIN_VALUE, maxkey = -1;
        int low = Integer.MAX_VALUE, lowkey = -1;
        for (int i = 0;i<n;i++){
            int currkey = arr[i];
            int ckfreq = map.get(arr[i]);

            if(ckfreq>maxfreq){
                maxfreq = ckfreq;
                maxkey = currkey;
            }
        }
        for (int i = 0;i<n;i++){
            int clkey = arr[i];
            int clfreq = map.get(arr[i]);

            if(clfreq<low){
                clkey = lowkey;
                lowkey = clkey;
            }
        }
        System.out.println(maxkey);
        System.out.println(maxfreq);
        System.out.println(low);
        System.out.println(lowkey);
        //lowest wala dekhna h thoda
    }
}
