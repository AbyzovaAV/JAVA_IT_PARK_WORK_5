import java.util.Random;
import java.util.Scanner;

public class MainC {

    public static void main(String[] args) {
        //считываю
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк для массива :");
        int a = scanner.nextInt();
        System.out.println("Введите число столбцов для массива :");
        int b = scanner.nextInt();

        //заполняю
        int rr=0;
        Random random = new Random();
        int zero[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                zero[i][j] = random.nextInt(10);}
        }
        System.out.println("Массив");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {
                System.out.print(zero[i][j] + " ");
            }
            System.out.println();
        }
        //вывести мин каждой строки
        for (int i = 0; i < a; i++){
            int j = 0;
            int min;
            min =zero[i][j];
            for (j = 0; j < b; j++) {
                if (zero[i][j] < min)
                    min = zero[i][j];
            }

            System.out.println("Минимум "+ min);
        }
    }
}
