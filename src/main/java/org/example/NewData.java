package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewData {
    private File file;

    public NewData(File file) {
        this.file = file;
    }

    public String[] inputSportsmens() {
        System.out.println("Введите новых участников команды: ");
        String[] newsportsmens = new String[5];
        for (int i = 0; i < 5; i++) {
            newsportsmens[i] = new Scanner(System.in).nextLine();
        }
        return newsportsmens;
    }

    public void writeSportsmens(String[] sportsmens) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.newLine();
        for (int i = 0; i < 5; i++) {
            bufferWriter.write((i + 1) + ". " + sportsmens[i]);
            bufferWriter.newLine();
        }
        bufferWriter.close();
    }

    public int[] inputMedals() {
        System.out.println("Введите время команды: ");
        int[] medals = new int[25];
        for (int i = 0; i < 25; i++) {
            medals[i] = new Scanner(System.in).nextInt();
        }
        return medals;
    }

    public void writeMedals(int[] medals) throws IOException {
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        for (int i = 0; i < 25; i++) {
            bufferWriter.write(medals[i] + "");
            bufferWriter.newLine();
        }
        bufferWriter.close();
    }
}
