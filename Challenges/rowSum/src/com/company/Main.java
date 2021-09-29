package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };;

        System.out.println(Arrays.toString(rowSum(matrix)));
    }
    public static int [] rowSum (int [][] arr){
        int [] array = new int[arr.length];
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum = 0;
            for(int j = 0 ; j < arr[i].length ; j++){
                sum+= arr[i][j];
            }
            array[i] = sum;
            System.out.println("The SUM Of Row " + i + " = " + sum);
        }

        return array;

    }
}
