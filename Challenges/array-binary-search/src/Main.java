public class Main {

    public static void main(String[] args) {
        int arr[] = {-131, -82, 0, 27, 42, 68, 179};
        System.out.println(binarySearch(arr, -131));
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int middle = (left + (right - left) / 2);
            if(array[middle] == value ){
                return middle;
            } else if( array[middle] < value){
                left = middle +1;
            } else {
                right = middle -1;
            }

        }
        return -1;
    }
}