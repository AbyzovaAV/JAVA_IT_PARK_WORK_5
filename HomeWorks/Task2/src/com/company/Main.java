package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Show in range");
            System.out.println("2. Sum of numbers");
            System.out.println("3. Sum of digits");
            System.out.println("4. Exit");

            int command = scanner.nextInt();

            switch (command) {
                case 1:{
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    for (int i = a; i < b; i++){
                        if (i % 2 == 0){
                            System.out.println(i + " ");
                        }

                    }
                    break;
                }
                case 2:{
                    int a = scanner.nextInt();
                    int sum = 0;
                    for (int i = a; i > 0; i--){
                        int b = scanner.nextInt();
                        System.out.print(b + " ");
                        sum = sum + b;
                        }
                    System.out.print(sum);
                    System.out.println(" ");
                    break;
                }
                case 3:{
                    int a = scanner.nextInt();
                    int sum = 0;
                    for (int i = a; a > 0; a/=10){
                        sum +=a%10;
                    }
                    System.out.println(sum);
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }

    }
}
