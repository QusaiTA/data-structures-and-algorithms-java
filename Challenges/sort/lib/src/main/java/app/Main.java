package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Library library = new Library();


        int [] arr = {8,4,23,42,16,15};
//        int [] arr2 = {20,18,12,8,5,-2};
//        int [] arr3 = {5,12,7,5,5,7};

//        System.out.println(Arrays.toString(library.insertionSort(arr)));
//        System.out.println(Arrays.toString(library.insertionSort(arr2)));
//        System.out.println(Arrays.toString(library.insertionSort(arr3)));
        library.mergeSort(arr);
        for( int i = 0 ; i < arr.length ; i++){
            System.out.println(i+1 +"th result of merge sort => " + arr[i]);
        }

    }
}
