import java.util.Scanner;

public class MainB {

    public static void main(String[] args) {
//считываю
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк для массива :");
        int a = scanner.nextInt();
        System.out.println("Введите число столбцов для массива :");
        int b = scanner.nextInt();
        int t = 0;
        int zero[][] = new int[a][b];

        for (int i = 0; i < a; i++){
            if (i == 0 || i%2 == 0) {
                for (int j = 0; j < b; j++) {
                    zero[i][j] = t++;
                }
            }
            else if (i % 2 != 0) {
                for (int j = b - 1; j >= 0; j--){
                    zero[i][j]= t++;
                }
            }
        }
        for (int i = 0; i < a; i++){
            System.out.println();
            for (int j = 0; j<b;j++){
                System.out.print(zero[i][j] + " ");
            }
        }
        System.out.println();
    }
}