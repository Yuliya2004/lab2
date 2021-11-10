package rtu.mirea.gibo01.pr2;

import java.lang.*;
import java.util.*;

public class Matrix {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");

            int size = input.nextInt();

            Integer[] array1 = new Integer[size];

            System.out.print("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                array1[i] = input.nextInt();
            }
            System.out.print("Введённый массив: ");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + array1[i]);
            }

            System.out.print("\n" + "Максимальный элемент массива: ");
            int maxNumber = size;
            for (int i = 0; i < size; i++) {
                if (maxNumber <= array1[i]) {
                    maxNumber = array1[i];
                }
            }
            System.out.println(maxNumber);

            System.out.print("Минимальный элемент массива: ");
            int minNumber = array1[0];
            for (int i = 0; i < size; i++) {
                if (array1[i] < array1[0]) {
                    minNumber = array1[i];
                }
            }
            System.out.println(minNumber);

            System.out.print("Сумма элементов массива: ");
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array1[i];
            }
            System.out.println(sum);

            System.out.print("Среднее арифметическое элементов массива: ");
            int average = 0;
            for (int i = 0; i < size; i++) {
                average = sum / size;
            }
            System.out.println(average);

            System.out.print("Массив, отсортированный по возрастанию: ");
            Arrays.sort(array1);
            for (int i = 0; i < size; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println("\t");

            System.out.print("Массив, отсортированный по убыванию: ");
            Arrays.sort(array1, Collections.reverseOrder());
            for (int i = 0; i < size; i++) {
                System.out.print(array1[i] + " ");
            }
        }
}
