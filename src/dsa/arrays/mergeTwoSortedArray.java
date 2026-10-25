package javaCollege;

import java.util.*;

public class mergeTwoSortedArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        int arr2[] = new int [sc.nextInt()];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        int merge[] = new int[arr.length+arr2.length];
        int i = 0, j = 0, p = 0;
        while(i<arr.length && j< arr2.length){
            if(arr[i] < arr[j]){
                merge[p] = arr[i];
                i++;
                p++;
            } else if (arr[i] > arr[j]) {
                merge[p]  = arr2[j];
                j++;
                p++;
            } else {
               merge[p] = arr[i];
               i++;
               p++;
               merge[p] = arr[j];
               j++;
               p++;
            }
       while(i<arr.length){
           merge [p] = arr[i];
           i++;
           p++;
       }
       while(j<arr2.length){
           merge [p] = arr2[j];
           j++;
           p++;
       }
        }
        System.out.println(Arrays.toString(merge));
      }
}
