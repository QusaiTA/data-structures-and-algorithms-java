/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


    public int[] insertionSort(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i -1;
            int temp = arr[i]; //{8,4,23,42,16,15};
            while ( j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j -1;
                arr[j+1] = temp;
            }
        }
        return arr;
    }


    public void mergeSort(int [] arr){

        int n = arr.length;
        if(n > 1){
            int mid = n/2;
            int [] left = Arrays.copyOfRange(arr,0,mid);
            int [] right = Arrays.copyOfRange(arr,mid,n);

            mergeSort(left);
            mergeSort(right);
            merge(left,right,arr);
        }
    }

    public void merge(int [] left, int [] right, int [] arr){

        int i =0;
        int j =0;
        int k =0;

        while(i <left.length && j <right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        if(i == left.length) {
            while (j < right.length) {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        else {
            while (i < left.length) {
                arr[k] = left[i];
                k++;
                i++;
            }
        }
    }


}
