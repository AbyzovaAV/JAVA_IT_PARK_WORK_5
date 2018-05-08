import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("МЕНЮ: ");
            System.out.println("1.Показать диапазон");
            System.out.println("2.Сумма чисел");
            System.out.println("3.Сумма цифр");
            System.out.println("4.Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите два числа: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                        while (a != b) {
                            if (a % 2 == 0) {
                                System.out.println(a + " ");
                                a++;
                            } else {
                                a++;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println(" Введите число: ");
                    int a = scanner.nextInt();
                    int sum = 0;
                    for (int i = 0; i < a; i++) {
                        System.out.println(" Введите число: ");
                        int b = scanner.nextInt();
                        sum = sum + b;
                    }
                    System.out.println(sum);
                    break;
                }
                case 3: {
                    System.out.println(" Введите число: ");
                    int a = scanner.nextInt();
                    int sum = 0;
                    while (a != 0){
                        sum += (a % 10);
                        a/=10;
                    }
                    System.out.println(sum + " ");
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
