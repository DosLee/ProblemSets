package com.arrays;

/**
 * 描述:
 * 二分查找法
 *
 * @author lil
 * @create 2018-05-15 下午11:14
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = new int[] {1,2,3,4,5,6,7,8};
        int search = 8;
        System.out.println(index(data, search));
    }

    /* 呆式写法 */
    public static int index(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /* 二分查找 */
}
