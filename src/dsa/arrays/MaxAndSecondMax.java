package javaCollege;

public class MaxAndSecondMax {
    static void main(String[] args) {


           //second max  ----approach 1
//            int arr[] = {1,2,4,5,6,6,7,2,4,1};
//            Arrays.sort(arr);
//            int max = arr[arr.length-1];
//            int smax = Integer.MIN_VALUE;
//            for(int i = arr.length-2;i>=0;i++){
//                if(max != arr[i]){
//                    smax = arr[i];
//                    break;
//                }
//            }
//        System.out.println(smax);


        //second max  ----approach 2
        int arr[ ] = {1,2,5,7,8,9,4,6};
            int fmax = arr[0];
            int smax = Integer.MIN_VALUE;

            for(int i = 1;i<arr[i];i++){
                if(fmax < arr[i]){
                    smax = fmax;
                    fmax = arr[i];
                }
                else if(fmax>arr[i] && smax <arr[i]){
                    smax = arr[i];
                }
            }

        System.out.println(smax);
    }
}
