import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Заполните массив случайными числами в интервале [0,5].
        Введите число Х и найдите все значения, равные Х.
        П.С. Нужно также вывести сгенерированный массив
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(6);
        }
        System.out.println("Что ищем ?");
        int x = scanner.nextInt();
        for (int i=0;i<5;i++){
            System.out.println(array[i]);
        }
        int count=0;
        for (int i = 0; i < 5; i++) {
            if (array[i] == x) {
                count++;
                if (count==1){
                    System.out.print("Нашли , ");
                }
                System.out.print("array[" + i + "]=" + x + " ,");
            }
        }
        if(count==0){
            System.out.println("не нашли !");
        }


        //Вывести все простые числа в диапазоне от 2 до 1000.

        int counter =0;
        for (int i =2;i<=1000;i++) {
            for (int j=2;j<=i;j++){
                if(i % j==0){
                    counter++;

                }
            }
            if(counter<=1){
                System.out.println(i+",");
            }
            counter=0;
        }
    }
}
