/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

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
}
