import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8};
        System.out.print(Arrays.toString(insertShiftArray(arr,7)));
    }

    public static int[] insertShiftArray(int[] arr, int value){

        int[] newArr = new int[arr.length + 1];
        int middleElement = arr.length  /2;
        if(arr.length  % 2 == 0){
            middleElement = arr.length /2;

        }else {
            middleElement+=1;
        }
        newArr[middleElement] = value;
        for (int i = 0; i < arr.length  + 1; i++){
            if(i > middleElement){
                newArr[i] = arr[i -1];
            }
            if(i < middleElement){
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }

}
