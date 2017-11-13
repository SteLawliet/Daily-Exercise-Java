package SockesDemo.ThreadDemo;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Stelawliet on 17/10/28.
 */
public class Test0 {
    @Test
    public void fun1(){
        int size = (int) (Math.random() * 15 +10 );
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

//        int[] ints ={1,3,4,5,6,9,10,12,13,19};

        int[] arr0 = new int[size];
        for (int i = 0; i <size ; i++) {
            arr0[i]=i;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr0));

        long s0 = System.currentTimeMillis();
        System.out.println("binarySearch   "+Arrays.binarySearch(arr,arr[6]));
        long e0 = System.currentTimeMillis();
        long s1 =System.currentTimeMillis();
        System.out.println("SelectQuery    "+SelectQuery(arr,arr[6]));
        long e1 =System.currentTimeMillis();

        long u0 =e0-s0;
        System.out.println(e0+" - "+s0);
        System.out.println("binarySearch use "+u0+"mill");

        long u1 =e1-s1;
        System.out.println(e1+" - "+s1);
        System.out.println("SelectQuery use "+u1+"mill");



    }
    public static int SelectQuery(int[] arr,int i) {
        int maxValue = arr[arr.length - 1];
        int maxIndex = arr.length - 1;
        int minValue = arr[0];
        int minIndex = arr[0];

        int midValue = arr[arr.length-1>>>1];

        int midIndex = arr.length-1>>>1;

        while ( minIndex+1 < maxIndex) {


            if (i > midValue) {

                if(i== maxValue)return maxIndex;
                minValue = midValue;
                minIndex = midIndex;
                midIndex = (maxIndex + minIndex) >>> 1;
                midValue=arr[midIndex];


            } else if (i < midValue) {

                if (i==minValue)return minIndex;
                maxValue = midValue;
                maxIndex = midIndex;
                midIndex = (maxIndex + minIndex) >>> 1;
                midValue=arr[midIndex];

            } else return midIndex;

        }
        return -midIndex;
}}
