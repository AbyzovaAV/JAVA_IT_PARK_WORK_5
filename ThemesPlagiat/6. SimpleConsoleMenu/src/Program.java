import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //я хз для чего
        while (true) {
            System.out.println("MENU: ");
            System.out.println("1. Sum of numbers");
            System.out.println("2. Sub of numbers");
            System.out.println("3. Mult of numbers");
            System.out.println("4. Exit");

            // считывает к какому кейсу перейти
            int command = scanner.nextInt();

            //переходит к кейсу
            switch (command) {
                //1 кейс считывает 2 числа
                //складывает их
                //выводит результат на экран
                case 1: {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a + b);
                    break;
                }
                //2 кейс считывает 2 числа
                //вычитает из 1 второе
                //вводит результат
                case 2: {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a - b);
                    break;
                }
                //3 кейс считывает 2 числа
                //умножает их
                //выводи результат на экран
                case 3: {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a * b);
                    break;
                }
                //Что?Зачем?Почему?
                default: {
                    System.exit(0);
                    System.out.println("Программа завершила работу");//Как вывести данную информацию?
                    break;
                }
            }
        }
    }
}
