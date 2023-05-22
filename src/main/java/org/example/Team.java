package org.example;

import java.util.List;
import java.util.Scanner;

public class Team {
    private List<Competing> sportsmans;
    private String teamName;

    public Team(String teamName, List<Competing> sportsmans) {
        this.teamName = teamName;
        this.sportsmans = sportsmans; //Не нужно хардкодить в конструкторе пустой список. Т.к. мы не можем создать команду без спортсменов.
        // Соответственно передаём список спортсменов при создании команды
    }

    public void inputCompetings() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время каждого спортсмена команды " + teamName + ":");

//        for (int i = 1; i <= 5; i++) {
//        ^ Так делать нельзя, потому что теряется гибкость программы
//        1. Перебор списка должен начинаться с 0 элемента
//        2. При работе со списком ограничением должна быть не константа, а вычисляемое значение размера списка
        for (int i = 0; i < sportsmans.size(); i++) {
            System.out.print("Введите время спортсмена " + sportsmans.get(i).getName() + ": "); // Выводим имена спортсменов
            int time = console.nextInt();
            console.nextLine(); // очистка буфера
            sportsmans.get(i) // Получаем спортсмена по индексу
                    .setTime(time); // Устанавливаем время
        }
    }

    public int getSummaTime() {
        int result = 0;

        for (Competing s : sportsmans) {
            result += s.getTime();
        }
        return result;
    }
}


