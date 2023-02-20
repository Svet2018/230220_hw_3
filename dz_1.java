
//1 Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.*;

public class Dz_3 {

    public static void main(String[] args) {
        int number = ask_n();
        System.out.println();
        minMax(randomInt(number));
    }

    public static int ask_n(){ //Запрос n-количества целых чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n (длину целочисленного списка): ");
        int num = scanner.nextInt();
        System.out.println("Вы ввели число n (длину целочисленного списка) = " + num);
        return num;
    }

    public static ArrayList<Integer> randomInt(int num){//Генерация чисел в списке

        ArrayList<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++){
            list.add((random.nextInt(-1000, 1000)));
        }
        System.out.println("Сгенерированы случайные числа: ");
        for (int i: list){
            System.out.print(i + " ");
        }
        System.out.println();
        return list;
    }

    public static void minMax(ArrayList<Integer> arr) {//Вычисление минимального, максимального и среднеарифметического числа
        int min = 0;
        int max = 0;

        for (int item: arr) {
            if (item <= min) {
                min = item;
            }
            if (item >= max) {
                max = item;
            }
        }

        System.out.println();
        System.out.println("Минимальное число в списке: " + min);
        System.out.println("Максимальное число в списке: " + max);
        System.out.println("Среднеарифметическое этих чисел равно: " + (min + max)/2);
    }

}
