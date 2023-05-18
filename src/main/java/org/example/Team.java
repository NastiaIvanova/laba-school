package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    private List<Competing> sportsmens;

    private String teamName;
    private int time;
    //  private List<Competing> competings;

    public Team(String teamName) {
        this.teamName = teamName;
        this.sportsmens = new ArrayList<>();

    }

    ArrayList<Integer> timeSumm = new ArrayList();

    private void inputCompetings() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время каждого спортсмена команды " + teamName + ":");

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя спортсмена " + (i + 1) + ": ");
            String name = console.nextLine();
            System.out.print("Введите время спортсмена " + (i + 1) + ": ");
            int time = console.nextInt();
            timeSumm.add(time);
            console.nextLine(); // очистка буфера
            sportsmens.add(new Competing(name, time));
        }
    }

    public int getSummaTime() {

        int result = 0;

        for (int i = 0; i < 5; i++) {
            result += timeSumm.get(i);
        }
        return result;
    }
}


