package SockesDemo.ThreadDemo;


import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Stelawliet on 17/10/28.
 */
public class SortDemo {
    @Test
    public void fun1() {
        int size = (int) (Math.random() * 20 + 10);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(arr));
        MaoSort(arr);
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20);
        }

        SelectSort(arr);
        System.out.println(Arrays.toString(arr));


        int[] testInts ={0,1,2,3,4,5};


//        int index = SelectQuery(testInts,4);


    }

    public void SelectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 0; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

        }
    }

    public void MaoSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }




//    public int  SelectQuery(int[] arr,int i) {
//
//            int maxvalue = arr[arr.length - 1];
//
//            int maxIndex = arr.length - 1;
//
//            int minValue = arr[0];
//
//            int minIndex = arr[0];
//
//            int midValue = arr[(maxvalue + minValue) >> 1];
//
//            int midIndex = (maxIndex + minIndex) >> 1;
//
//            while ( midValue != i ) {
//
//                if (i > midValue) {
//
//                    minValue = midValue;
//
//                    minIndex = (maxIndex + minIndex) >> 1;
//
//                    midValue = (maxvalue + minValue) >> 1;
//
//                    minIndex = (maxIndex + minIndex) >> 1;
//
//                } else if (i < midValue) {
//
//                    maxvalue = midValue;
//
//                    maxIndex = (maxIndex + minIndex) >> 1;
//
//                    midValue = (maxvalue + minValue) >> 1;
//
//                    midIndex = (maxIndex + minIndex) >> 1;
//
//                } else if (midIndex <= 0){
//
//                    return -1;
//                }
//            }
//            return midIndex;
//
//    }


}
