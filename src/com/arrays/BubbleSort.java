package com.arrays;

/**
 * 描述:
 * 简单冒泡排序
 *
 * @author lil
 * @create 2018-05-14 下午9:53
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[] {1,3,2,5,6,9,7,8,0,4};
        sort(data);
    }

    public static void sort(int[] data) {
        // 控制整体循环次数
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // 互换位置
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
