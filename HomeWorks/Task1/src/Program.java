import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число в дапазоне от 0 до 255");
        int i = scanner.nextInt();

        int x0 = i % 2;
        i = i / 2;
        int x1 = i % 2;
        i = i / 2;
        int x2 = i % 2;
        i = i / 2;
        int x3 = i % 2;
        i = i / 2;
        int x4 = i % 2;
        i = i / 2;
        int x5 = i % 2;
        i = i / 2;
        int x6 = i % 2;
        i = i / 2;
        int x7 = i % 2;
        i = i / 2;

        System.out.println(x0 + "" + x1 + "" + x2 + "" + x3 + "" + x4 + "" + x5 + "" + x6 + "" + x7);

    }
}
