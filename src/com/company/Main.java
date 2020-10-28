package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        showArray(array);
        System.out.println("Если что то не правильно введите, порядковый номер элемента, который хотите заменить, если все правильно введите 0: ");
        int good = sc.nextInt();
        switch (good) {
            case 0:
                showArray(array);
                break;
        }
        for (int i = 1; i < array.length; i++) {
            if (i == good) {
                array[i] = sc.nextInt();
                showArray(array);
            }

        }
        System.out.println("\nНиже выведен Ваш массив ");
        round(array);
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void round(int[] array) {

        for (int i = 0; i < array.length; i++) {


            System.out.println((int)(Math.round(array[i]/10)*10));
        }
        System.out.println();
    }

}
