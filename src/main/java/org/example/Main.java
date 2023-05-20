package org.example;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Команда 1");
        Team team2 = new Team("Команда 2");
        int result1 = teamNumber1(team1);
        int result2 = teamNumber2(team2);
        if (result1 < result2) {
            System.out.println("Победила первая команда с результатом: " + result1);
        } else if (result1 > result2) {
            System.out.println("Победила вторая команда с результатом: " + result2);
        } else {
            System.out.println("Победила дружба!!! Результаты команд: " + result2);
        }
    }

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

