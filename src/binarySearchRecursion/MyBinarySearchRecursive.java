package binarySearchRecursion;

public class MyBinarySearchRecursive {
    private int[] arr;

    public MyBinarySearchRecursive(int[] arr) {
        this.arr = arr;
    }

    public int binarySearch(int searchElement, int low, int high){

        if(low > high) {
            return 0;
        }
        int mid = (low+high)/2;
        if(searchElement == arr[mid]){
            return mid;
        }
        else if (searchElement < arr[mid]){
            return binarySearch(searchElement,low,mid-1);
        }
        else{
            return binarySearch(searchElement,mid+1,high);
        }

    }
}
