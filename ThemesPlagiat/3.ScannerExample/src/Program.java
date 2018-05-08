import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextShort();
        System.out.println(x * x);
    }

}
