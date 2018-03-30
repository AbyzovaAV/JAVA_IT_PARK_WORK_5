import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 255");
        int a = scanner.nextInt();//ввела значение
        int b = 2;//на что делю
        int c = a%b;//1
        int cc = a/b;//1
        int x = cc%b;//2
        int xx = cc/b;//2
        int z = xx%b;//3
        int zz = xx/b;//3
        int q = zz%b;//4
        int qq = zz/b;//4
        int w = qq%b;//5
        int ww = qq/b;//5
        int p = ww%b;//6
        int pp = ww/b;//6
        int g = pp%b;//7
        int gg = pp/b;//7
        int t = gg%b;//8
        int tt = gg/b;//8
        System.out.println((t)+""+(g)+""+(p)+""+(w)+""+(q)+""+(z)+""+(x)+""+(c));

        }
}