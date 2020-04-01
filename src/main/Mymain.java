package main;

import binarySearchRecursion.MyBinarySearchRecursive;

public class Mymain {
    public static void main(String[] args) {
        int[] sortedArray  = {10,20,30,40,50,60,70,80,90,100};
        int searchElement  = 10;
        MyBinarySearchRecursive obj = new MyBinarySearchRecursive(sortedArray);
        int low = 0;
        int high = sortedArray.length - 1;
        int result = obj.binarySearch(searchElement,low,high);

        if(result == -1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
}
