package LB.Collection_Framework.Array;

import java.util.*;
public class Arrays_V1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// Avg of array elemrnts --> TC = O(n) & SC = O(n)
       /* int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println(avg);*/

        /// Multiply each element of array by 10 --> TC = O(n) & SC = O(n)
       /* int arr[] = {1,2,3,4,50,6};
        for (int i = 0;i<arr.length;i++){
            arr[i] = arr[i] *10;
            System.out.println(arr[i]);
        }*/

        /// Search an element in array --> Linear Search - Boolean req --> TC = O(n) & SC = O(1)
       /* int arr[] = {1,2,3,4,50,6};
        boolean isFound;
        int target = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                isFound = true;
                System.out.println("Found at index: "+ i);
                break;
            }
            }
            if(!isFound) {
                System.out.println("Not Found");
        }*/

        /// Max element in array --> Brute Force --> TC = O(n) & SC = O(1)
      /*  int arr[] = {1,2,300,4,50,6};
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);*/

        /// Return sum of pos and neg numbers --> TC = O(n) & SC = O(1)
     /*   int arr[] = {1,-2,3,4,-5,6};
        int posSum = 0, negSum = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] > 0){
                posSum += arr[i];
            }
            if (arr[i] < 0){
                negSum +=arr[i];
            }
        }
        System.out.println("Positive Sum: " + posSum + " Negative Sum: " + negSum);*/

        /// Count zeroes and ones in Binary array --> TC = O(n) & SC = O(1)
        /*int arr[] = {0,1,1,1,0,0,0,1,0,0,0,1,1,0};
        int zc = 0, oc = 0;
        for (int i = 0;i< arr.length;i++){
            if(arr[i] == 0){
                zc++;
            }
            else oc++;
        }
        System.out.println(zc);
        System.out.println(oc);*/

        /// Find first unsorted element --> TC = O(n) & SC = O(1)
     /*   int[] arr = {1,2,300,4,5,6};
        for (int i = 0;i<arr.length-1;i++){ //we are dealing with i+1 so loop should stop one index before
            if(arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }*/
    }
}
