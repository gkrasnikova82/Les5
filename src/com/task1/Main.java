package com.task1;

import java.util.Arrays;

//ДЗ 4_1 Сдвиг элементов массива
//Дан двумерный массив. Задача – написать метод
// public void toLeft() {}

//1.Пройти с 1-ой до последней строки
// 2.Пройти с 1-го до предпоследнего элемента
// 3.В текущую ячейку поместить значение следующей
//  4.Последнему элементу присвоить 0

public class Main {

    public static void main(String[] args) {

      toLeft();// Вызываем метод
    }
    public static void toLeft() //Метод toLeft сдвиг элементов двумерного массива.
    {
        int[][] myArray = {{0, -2, 3, 4, 5, 6, 7, 8, 9, 10}, {0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, {0, 2, 3, 4, 5, 6, 7, 8, 9, 10}}; // объявление и выделение памяти “в одном флаконе”
        System.out.println("количество строк двумерного массива: "+myArray.length); // вывели в консоль длину массива, то есть количество элементов, которые мы можем поместить в массив
        System.out.println("количество элементов в строке: "+myArray[0].length);
        System.out.println(Arrays.deepToString(myArray));
        for ( int i = 1; i <= myArray.length; i++){
            {for ( int y = 1; y < myArray[0].length; y++) {
                myArray[i-1][y-1]=myArray[i-1][y];
            }
                myArray[i-1][myArray[0].length-1]=0;
            }
        }
        System.out.println(Arrays.deepToString(myArray));


    }


}


