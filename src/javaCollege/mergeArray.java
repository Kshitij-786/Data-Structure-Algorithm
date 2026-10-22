package javaCollege;

public class mergeArray {
    static void merge(int [] a, int [] b){
        int r [] = new int[a.length  + b .length];
        int j = 0, i = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                r[k] = a[i];
                i++;
                k++;
            }
            if(a[i] > b[j]){
                r[k] = b[j];
                j++;
                k++;
            }
        }
        //bachi hui values rakhne ka kaam
        while(i<a.length ) {
                r[k] = a[i];
                i++;
                k++;

        }
            while( j<b.length){
                    r[k] = b[j];
                    j++;
                    k++;
                }

    }
    static void main(String[] args) {


        ///
       /* public static void sort(int[] arr, int left, int right) {

            if (left right) {

// Find the middle point

                int mid left + (right left) / 2;


// Sort first and second halves


                sort(arr, left, mid);



                sort(arr, mid + 1, right);


// Merge the sorted halves

                merge(arr, left, mid, right);
            }*/
    }
}
