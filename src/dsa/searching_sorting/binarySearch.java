package javaCollege;

///  check this
public class binarySearch {
    static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int i = 0, j = arr.length-1;
        int target = 1;
        while(i<=j){
        int mid =i + (j-i)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]>target) {
                j = mid -1;
            } else if (arr[mid]<target) {
                i = mid + 1;
            }
        System.out.println(mid);
            break;
        }
    }
}
