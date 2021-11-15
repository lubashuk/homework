package com.company;

import java.util.NavigableMap;
import java.util.Random;

public class homework3_rework {
    final Random random = new Random();

    public static void main(String[] args) {
        homework3_rework hw3 = new homework3_rework();
        System.out.println("task1");
        int[] arr1 = new int[5];
        int x = 0;
        int i = 0;

        while (i < 10) {
            i += 2;
            arr1[x] = i;
            ++x;
            System.out.print(i + (","));
        }

        System.out.println("  ");

        hw3.createRandomArray(10);

        for (int h = 0; h < 20; ++h) {
            System.out.print(Integer.toHexString(h) + ",");
        }

    }

    public void createRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ",");
        }
        arr[arr.length - 1] = random.nextInt(100);
        System.out.print(arr[arr.length - 1] + ".");
        System.out.println();
        System.out.println(  "Minimal value is: " +  findMin(arr) );
        System.out.println(  "Max value is: " +  findMax(arr) );
        System.out.println(  "Avarage value is : " + findAvg(arr));
        System.out.println(  "All binate values:  " );
        findBinate(arr);
    }
    public void findBinate(int[] intArr) {
        System.out.println("task6");
        for (int i = 0; i < intArr.length; i = i + 2) {
            System.out.print(intArr[i] + ",");
        }
    }

    public int findMin(int[] intArr) {
        int min = 100;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        return min;
    }
    public int findMax(int[] intArr) {
        int max = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return max;
    }
    public int findAvg(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum = sum + intArr[i];
        }
        return sum / intArr.length;
    }

}