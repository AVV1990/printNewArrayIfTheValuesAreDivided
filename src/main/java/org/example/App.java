package org.example;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    // задача :  написать программу, которая заносит в массив первые 100 целых чисел, делящихся на 13 или на 17


    public static void main(String[] args) {
        int[] inputArr = new int[100]; // пустой исходный массив


        System.out.println(Arrays.toString(printNewArray( inputArr, 13,17)));


    }


    public static Integer[] printNewArray(int[] arr, int firstDivider, int secondDivider) {
        int[] testArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // заполнение исходного массива от 1 до 100


            if (((arr[i] % firstDivider) == 0) || ((arr[i] % secondDivider) == 0)) { // заполнение тестового массива  из исходника теми числами ,которые делятся, остальные 0 в конце
                testArr[index] = arr[i];
                    index++;

            }


        }


        List<Integer> list = new ArrayList<>(); // создаем ArrayList, кладем туда значения из тестового массива, который не равны 0
        for (int a : testArr) {
            if (a != 0) {
                list.add(a);
            }

        }

        Integer[] finalArr = new Integer[list.size()]; // создаем финальный массив, из ArrayList
            finalArr = list.toArray(finalArr);

            return finalArr;



    }
}
