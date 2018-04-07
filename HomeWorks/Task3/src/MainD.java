import java.util.Random;
import java.util.Scanner;

public class MainD {

    public static void main(String[] args) {
//считываю
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк для массива :");
        int a = scanner.nextInt();
        System.out.println("Введите число столбцов для массива :");
        int b = scanner.nextInt();

//заполняю
        int sum = 0;
        Random random = new Random();
        int zero[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                zero[i][j] = random.nextInt(10);}
        }

//вывожу
        System.out.println("Массив");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {
                System.out.print(zero[i][j] + " ");
            }
            System.out.println();
        }
//сумма побочных элементов масива
        int t = b - 1;
        while (t >= 0)
        {
            for (int i = 0; i < a; i++)
            {
                sum = zero[i][t] + sum;
                t--;
            }
        }
        System.out.println("Сумма эллементов :" + sum);
    }
}