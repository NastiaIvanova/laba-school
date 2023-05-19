package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    private List<Competing> sportsmens;
    private String teamName;
    //  private List<Competing> competings;

    public Team(String teamName) {
        this.teamName = teamName;
        this.sportsmens = new ArrayList<>();
    }

    public void inputCompetings() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время каждого спортсмена команды " + teamName + ":");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите время спортсмена " + i + ": ");
            int time = console.nextInt();
            console.nextLine(); // очистка буфера
            sportsmens.add(new Competing("Спортсмен " + i, time));
        }
    }

    public int getSummaTime() {
        int result = 0;

        for (Competing s : sportsmens) {
            result += s.getTime();
        }
        return result;
    }
}


