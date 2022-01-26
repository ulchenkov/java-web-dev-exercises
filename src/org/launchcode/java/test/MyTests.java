package org.launchcode.java.test;

import java.util.*;

public class MyTests {
    public static void main(String[] args) {
        Integer[] myArr = new Integer[2];
        int currentElement = 0;
        int newNumber;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            newNumber = scanner.nextInt();
            if (currentElement == myArr.length) {
                myArr = expandArray(myArr);
                printArr(myArr);
            }
            myArr[currentElement] = newNumber;
            currentElement++;
        } while (newNumber != 0);
        printArr(myArr);
    }

    private static Integer[] expandArray(Integer[] arr) {
        Integer[] newArr = new Integer[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    private static void printArr(Integer[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%s, ", arr[i]);
        }
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.println("]");
    }


}
