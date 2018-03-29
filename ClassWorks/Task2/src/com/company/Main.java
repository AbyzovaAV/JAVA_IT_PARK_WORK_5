package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 2, 2};
        for (int i = 0; i < a.length; i++) {
            a[2] = a[3];
            a[3] = a[4];
            
            System.out.print(a[i]+" ");

        }
    }
}
