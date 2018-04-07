package com.company;

public class Main {

    public static void main(String[] args) {

        int a[] = {5, 6, 1, 2, 2};
        System.out.println("Массив до изменений ");

        // for (int i = 0; i < a.length; i++)
        for (int number : a){
           // System.out.print(a[i] + " ");
            System.out.print(number + " ");
        }
            System.out.println();

        System.out.print("Массив после замены 2 элемента на ноль ");
        System.out.println();
       int b[] = a;
       b[2] = 0;
        for(int number : b){
            System.out.print(number + " ");// : присвоение??
       }

    }
}

