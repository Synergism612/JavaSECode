package com.atguigu2.two.exer1;

/**
 * 案例
 * 二维数组求和
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("总和为：" + sum);
    }
}
