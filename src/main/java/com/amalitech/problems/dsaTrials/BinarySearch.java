package com.amalitech.problems.dsaTrials;

public class BinarySearch {

    public static int BinarySearchSolution (int[] arr, int target){
        int left = 0;
        int right  = arr.length -1;
        int tracker = 0;

        while (left <= right){

            int mid = (left + right)/2;

            if(arr[mid] == target) {
                System.out.printf("Binary Steps = %d", tracker);
                System.out.println();
                return mid;
            }
            if(arr[mid] < target){
                left = mid+1;
                tracker++;
            } else {
                right = mid-1;
                tracker++;
            }

        }


        return -1;
    }


    public static int LinearSearchSolution(int[] arr, int target){
        int tracker = 0;


        for (int i = 0; i< arr.length; i ++ ){
            tracker ++;
            if(arr[i] == target){
                System.out.printf("Linear Search: Steps = %d", tracker);
            System.out.println();
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] myArr = {1,2,3,4,5,6,7,8,9};
        int target = 9;


        System.out.println(BinarySearchSolution(myArr, target));
        System.out.println(LinearSearchSolution(myArr, target));




    }
}
