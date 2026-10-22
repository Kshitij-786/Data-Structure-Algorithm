package javaCollege;

import java.util.Arrays;

public class merge_sort_new {
    static void sort(int arr[]){
        divide(arr, 0 , arr.length-1);
    }
    static void divide(int a[] , int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            divide(a,l,m);
            divide(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    static void merge(int []a , int l , int m , int r){
        int []temp = new int [r-l+1];
        int i = l;
        int j = m+1;
        int k = 0; //temp aaray index

        while(i<=m && j<=r){
            if(a[i] <= a[j]){
                temp[k] = a[i];
                i++;
                k++;
            }
            else{
                temp[k] = a[j];
                j++;
                k++;
            }
        }
            while(i<=m){
                temp[k] = a[i];
                i++;
                k++;

            }
            while(j<=r){
                temp[k] = a[j];
                j++;
                k++;
            }
            for(int p = 0;p<temp.length;p++){
                a[l+p] = temp[p];
            }
    }
    static void main(String[] args) {
        int a [] = {1,5,4,5,8,7,8,8,2,4,2,8};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
