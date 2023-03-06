package com.exe.demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world");

        Demo demo = new Demo();
        demo.bubbleSort();
    }
    public void demo(){
        System.out.println("hello world 2");
    }
    public void bubbleSort(){
        //初始化一个数组
        //初始化一个静态化数组
        Integer[] array = {2, 5, 8, 7, 3, 6, 1};
        //动态初始化一个数组
        //int[] ints = new int[10];
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[i]<array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
            List<Integer> list = Arrays.asList(array);
            System.out.println(list);
    }
}
