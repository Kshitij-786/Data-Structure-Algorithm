package dsa;

import java.util.*;
public class temp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///  Linear Search
//        int[] arr = {10, 25, 7, 40, 15, 30};
//        int target = 15;
//        boolean isFound = false;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] == target){
//                isFound = true;
//                System.out.println(i);
//                break;
//            }
//            }
//            if(!isFound){
//                System.out.println("Not Found");
//        }

        /// Binary Search
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = sc.nextInt();
        int left = 0, right = arr.length - 1;
            boolean isFound = false;
        while (left <= right) {
           int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found");
                isFound = true;
                break;
            }
            if (target > arr[mid]) {
               left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }
        }
            if (!isFound) {
                System.out.println("Not Found");
        }
    }
}