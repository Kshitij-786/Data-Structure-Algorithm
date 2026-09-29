package javaCollege;

import java.util.ArrayList;

public class Kadane_Algo {
    static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5};

        int max = arr[0] , s = 0, e = 0;
        int cur = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(arr[i]>cur+arr[i]){
                cur = arr[i];
                s = i;
            }
            else{
                cur = cur+arr[i];
                if(max>cur){

                }
            }
        }
        System.out.println(max);

    }
}
