public class Main {
    public static void main(String[] args) {
    int  firstArray []= {1,2,3,4,5,6};
    int  secoundArray [] = reverseArray(firstArray);
    for(int i = 0 ; i < firstArray.length ; i++){
        System.out.println(secoundArray[i]);
    }
    }

    public static int [] reverseArray (int [] array){
        int newArray[]  = new int[array.length];
        int counter =0;
        for(int i = array.length-1; i>=0 ; i--){
            newArray[counter] = array[i];
            counter ++;

        }

        return newArray;
    }
}
