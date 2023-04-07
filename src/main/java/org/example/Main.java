package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result1 = teamNumber1();
        int result2 = teamNumber2();
        if (result1 > result2) {
            System.out.println("Победила первая команда с результатом: " + result1);
        } else if (result1 < result2) {
            System.out.println("Победила вторая команда с результатом: " + result2);
        } else {
            System.out.println("Победила дружба!!! Результаты команд: " + result2);
        }
    }

    static int teamNumber1() {
        System.out.println("Список спортсменов первой команды: ");
        String text = """
                1. Иванов Иван Иванович
                2. Петров Петр Петрович
                3. Сидоров Алексей Владимирович
                4. Александров Александр Александрович
                5. Снежкова Мария Юрьевна
                """;
        System.out.println(text);
        System.out.println("ВВведите количество медалей каждого спортсмена первой команды: ");

        int [] medals1 = inputMedals();

        int summa = summaMedals(medals1);
        System.out.println("Сумма медального зачёта первой команды: " + summa);
        return summa;
    }

    static int teamNumber2() {


        System.out.println("Список спортсменов второй команды: ");
        String text2 = """
                1. Сергеев Дмитрий Анатольевич
                2. Голубева Анна Евгеньевна
                3. Ведеев Виктор Алексеевич
                4. Павлова Елена Сергеевна
                5. Владов Владлен Владиславович
                """;
        System.out.println(text2);
        System.out.println("ВВведите количество медалей каждого спортсмена второй команды: ");

        int[] medals2 = inputMedals();

        int summa = summaMedals(medals2);
        System.out.println("Сумма медального зачёта второй команды: " + summa);
        System.out.println();
        return summa;
    }

    public static int[] inputMedals() {
       int[] medals = new int[5];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < medals.length; i++) {
            medals[i] = console.nextInt();
        }
        return medals;
    }

    public static int summaMedals(int[] array){
        int result = 0;

        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }
}
