
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//2 Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Dz_3_2 {
  
    public static void main(String[] args) {
        int number = ask_n();
        evenOdd(randomInt(number));
        System.out.println();
    }

    public static int ask_n(){ //Запрос n-количества целых чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n (длину целочисленного списка): ");
        int num = scanner.nextInt();
        System.out.println("Количество элементов в сгенерированном списке = " + num);
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
        Collections.sort(list);
        System.out.println("Отсортированный список от наименьшего числа к наибольшему: ");
        for (int i: list){
            System.out.print(i + " ");
        }
        return list;
    }

    public static void evenOdd(ArrayList<Integer> arr) {//Вычисление удаление четных чисел

        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();

        for (int item: arr) {
            if (item % 2 == 0) {
                even.add(item);
            }
            if (item % 2 != 0)  {
                odd.add(item);
            }
        }

        System.out.println();
        System.out.println("Список в котором удалены все четные числа, остались нечетные числа: " + odd);
        System.out.println("Удаленные из сгенерированного списка четные числа: " + even);

    }
}
