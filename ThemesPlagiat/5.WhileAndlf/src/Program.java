import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вводим переменную currentNumber
        int currentNumber = scanner.nextInt();


        int evens = 0;
        int obbs = 0;
        //если currentNumber не равен -1
        //спускаемся дальше
        //равен - заканчиваем программу
        while (currentNumber != -1) {
              //если при делении остатка нет
              //т.е. число четное
              //увеличиваем evens на 1
              if (currentNumber % 2 == 0) {
                  evens++;
              }
              //если при делении остаток есть
              //1 прибавляем obbs
              else {
                  obbs++;
              }
              //считываем следующее число
              //до тех пор пока считанное значение не будет равно -1
              //тогда программа завершится
              currentNumber = scanner.nextInt();
        }
        //выводим результаты
        System.out.println("Evens count - " + evens);
        System.out.println("Obbs count - " + obbs);
    }

}
