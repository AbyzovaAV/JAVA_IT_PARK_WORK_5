import java.util.Random;
import java.util.Scanner;

public class MainA {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое  :");
        int a = scanner.nextInt();
        //System.out.println("Введите число столбцов для массива :");
        //int b = scanner.nextInt();
        int b = 0;
        Random random = new Random();
        int zero[] = new int[a];
        for (int i = 0; i < a; i++) {
                zero[i] = random.nextInt(10);
            }
        System.out.println("Массив");
        for (int i = 0; i < a; i++){

                System.out.print(zero[i] + " ");
            }
            System.out.println();
        }

    }
