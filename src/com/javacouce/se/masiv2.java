package com.javacouce.se;
import java.util.Arrays;
import java.util.Random;
public class masiv2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        System.out.println();
        int[] arr = generateRandomArray(30);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] generateRandomArray(int size) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        // Задание 1

//Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("Задание 1");
        int sum = 0;
        int[] arr = generateRandomArray(100_000);
        for (int vaiue : arr) {
            sum += vaiue;
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");
    }

    public static void task2() {

        //Задание 2
        //Следующая задача — найти минимальную и максимальную трату за день.
//Нужно написать программу, которая решит эту задачу, и вывестиМинимальная в консоль результат
////в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        System.out.println("Задание 2");
        int[] arr = generateRandomArray(0);
        int min = arr[0];
        int max = arr[0];
        for (int element: arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + "рублей");
        System.out.println("Максимальная сумма трат за день составила "+ max + "рублей");

    }
    public static void task3() {
        //Задание 3
//А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.

//Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц сост### Задание 3
//А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        System.out.println("задание 3");
        int[]arr=generateRandomArray(0);
        int sum=0;
        for (int i:arr) {
            sum+=i;
        }
        System.out.println( sum / (float) arr.length);
    }
    public static void task4() {
        // Задание 4
//Отойдем от подсчетов.
//В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
//Данные с именами сотрудников хранятся в виде массива символов (char[]).
//Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
//char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//В результате в консоль должно быть выведено "Ivanov Ivan".
        System.out.println("Задание 4");
        char[]reverseFuiiName={'n','a','V','I',' ','V','o','n','a','v','I'};
        for (int i = reverseFuiiName.length-1;i>=0; i--) {
            System.out.print(reverseFuiiName[i]);
        }
    }
}

