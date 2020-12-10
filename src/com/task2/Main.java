package com.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      //  Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
       // Задачу не зачитывать если использованы утильные методы класса Arrays.
        // Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
      //  Вывести массив в консоль до и после вызова метода по реверсу массива
        int[] myArray = {0, -2, 3, 4, 5, 6, 7, 8, 9, 10, 13};
        System.out.println("количество элементов в строке: "+myArray.length);
        System.out.println(Arrays.toString(myArray));
        int temp= myArray[0];
        for ( int i = 1; i <= myArray.length/2; i++){
                myArray[i-1]=myArray[myArray.length-i];
                myArray[myArray.length-i]= temp;
                temp=myArray[i];

        }
        System.out.println(Arrays.toString(myArray));


    }
}