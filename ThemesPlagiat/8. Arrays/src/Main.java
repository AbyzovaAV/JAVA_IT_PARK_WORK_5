public class Main {
    public static void main(String[] args) {
        //иннициализируем массив
        int a[] = {3, 4, 5, 6, 1};

        //пробегаемся по нему и выводим
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        //пусота
        System.out.println();

        //не поняла как он это сделал
        for (int i  = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }

        //пустота
        System.out.println();


        //ооо, любимая штучка
        for (int number : a) {
            System.out.println(number + " ");
        }
    }
}
