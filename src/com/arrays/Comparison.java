package com.arrays;


/**
 * 入门
 *     得出数组里最大值, 最小值
 */
public class Comparison {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        commpare(array);
    }

    public static void commpare(int[] data) {
        int max = data[0];
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }

            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
