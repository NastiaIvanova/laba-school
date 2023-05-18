package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int result1 = teamNumber1();
        int result2 = teamNumber2();
        if (result1 < result2) {
            System.out.println("Победила первая команда с результатом: " + result1);
        } else if (result1 > result2) {
            System.out.println("Победила вторая команда с результатом: " + result2);
        } else {
            System.out.println("Победила дружба!!! Результаты команд: " + result2);
        }
    }
    Scanner console = new Scanner(System.in);
    System.out.print("Введите название первой команды: ");
    Team team1 = new Team(console.nextLine());
    System.out.print("Введите название второй команды: ");
    Team team2 = new Team(console.nextLine());

    int result1 = team1.sumTime();
    int result2 = team2.sumTime();
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
        System.out.println("Введите время каждого спортсмена первой команды: ");

        int [] time1 = inputTime();

        int summa = sumTime(time1);
        System.out.println("Сумма общего времени первой команды: " + summa);
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
        System.out.println("Ввведите время каждого спортсмена второй команды: ");

        int[] time2 = inputTime();
        int summa = sumTime(time2);
        System.out.println("Сумма общего времени второй команды: " + summa);
        System.out.println();
        return summa;
    }

    public static int[] inputTime() {
        int[] medals = new int[5];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < medals.length; i++) {
            medals[i] = console.nextInt();
        }
        return medals;
    }
}
