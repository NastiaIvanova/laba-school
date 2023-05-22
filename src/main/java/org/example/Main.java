package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Под "хардкодить" имел в виду сделать список внутри кода, а не просто выводить в консоль текст
        List<Competing> sportsmansOfTeam1 = List.of(
                new Competing("Иванов Иван Иванович"),
                new Competing("Петров Петр Петрович"),
                new Competing("Сидоров Алексей Владимирович"),
                new Competing("Александров Александр Александрович"),
                new Competing("Снежкова Мария Юрьевна")
        );
        List<Competing> sportsmansOfTeam2 = List.of(
                new Competing("Сергеев Дмитрий Анатольевич"),
                new Competing("Голубева Анна Евгеньевна"),
                new Competing("Ведеев Виктор Алексеевич"),
                new Competing("Павлова Елена Сергеевна"),
                new Competing("Владов Владлен Владиславович")
        );

        Team team1 = new Team("Команда 1", sportsmansOfTeam1);
        Team team2 = new Team("Команда 2", sportsmansOfTeam2);
        team1.inputCompetings(); // Вызываем ввод здесь
        team2.inputCompetings(); // Вызываем ввод здесь
        int result1 = team1.getSummaTime(); // Вычисляем результат команды 1
        int result2 = team2.getSummaTime(); // Вычисляем результат команды 2

        if (result1 < result2) {
            System.out.println("Победила первая команда с результатом: " + result1 + " сек."); // Добавлена информативность выводу
        } else if (result1 > result2) {
            System.out.println("Победила вторая команда с результатом: " + result2 + " сек."); // Добавлена информативность выводу
        } else {
            System.out.println("Победила дружба!!! Результаты команд: " + result2 + " сек."); // Добавлена информативность выводу
        }
    }

    // От дублирования вы не ушли. У вас всё так же два идентичных метода. TODO: Удалить
    static int teamNumber1(Team team) {
        System.out.println("Список спортсменов первой команды: ");
        String text = """
                1. Иванов Иван Иванович
                2. Петров Петр Петрович
                3. Сидоров Алексей Владимирович
                4. Александров Александр Александрович
                5. Снежкова Мария Юрьевна
                """;
        System.out.println(text);
        team.inputCompetings();
        int summa = team.getSummaTime();
        System.out.println("Сумма общего времени первой команды: " + summa);
        return summa;
    }

    // От дублирования вы не ушли. У вас всё так же два идентичных метода. TODO: Удалить
    static int teamNumber2(Team team) {
        System.out.println("Список спортсменов второй команды: ");
        String text2 = """
                1. Сергеев Дмитрий Анатольевич
                2. Голубева Анна Евгеньевна
                3. Ведеев Виктор Алексеевич
                4. Павлова Елена Сергеевна
                5. Владов Владлен Владиславович
                """;
        System.out.println(text2);
        team.inputCompetings();
        int summa = team.getSummaTime();
        System.out.println("Сумма общего времени второй команды: " + summa);
        System.out.println();
        return summa;
    }
}

