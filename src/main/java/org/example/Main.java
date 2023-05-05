package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int result1 = teamNumber1();
        int result2 = teamNumber2();

        if (result1 > result2) {
            System.out.println("Победила первая команда с результатом: " + result1);
        } else if (result1 < result2) {
            System.out.println("Победила вторая команда с результатом: " + result2);
        } else {
            System.out.println("Победила дружба!!! Результаты команд: " + result1);
        }
    }

    static int teamNumber1() {
        System.out.println("Список спортсменов новой первой команды: ");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("comand1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("количество медалей каждого спортсмена первой команды: ");
        reader = null;
        try {
            int sum = 0;
            reader = new BufferedReader(new FileReader("medals1.txt"));
            String line;
            int i = 0,b = 0;
            ArrayList<Integer> comands = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                i++;
                System.out.println(line);
                sum += Integer.parseInt(line);
                if (i %5 == 0)
                {
                    b++;
                    comands.add(sum);
                    sum = 0;

                }
            }
            System.out.println("Сумма медалей команды: " + comands.get(0));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Введите новых участников первой команды: ");
        String[] newsportsmens1 = new String[5];
        for (int i = 0; i < 5; i++) {
            newsportsmens1[i] = new Scanner(System.in).nextLine();
        }
        try {
            FileWriter writer = new FileWriter("comand1.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.newLine();
            for (int i = 0; i < 5; i++) {
                bufferWriter.write(i +"."+ newsportsmens1[i]);
                bufferWriter.newLine();
            }
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Введите медали новой первой команды: ");
        int[] medals1 = inputMedals();

        int summa = summaMedals(medals1);
        System.out.println("Сумма медального зачёта первой команды: " + summa);
        System.out.println();
        return summa;
    }

    static int teamNumber2() {
        System.out.println("Список спортсменов второй команды: ");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("comand2.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("количество медалей каждого спортсмена второй команды: ");
        reader = null;
        try {
            int sum2 = 0;
            reader = new BufferedReader(new FileReader("medals2.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum2 += Integer.parseInt(line);
            }
            System.out.println("Сумма медалей команды: " + sum2);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Введите новых участников второй команды: ");
        String[] newsportsmens2 = new String[5];
        for (int i = 0; i < 5; i++) {
            newsportsmens2[i] = new Scanner(System.in).nextLine();
        }

        System.out.println("Введите медали новой второй команды: ");
        int[] medals2 = inputMedals();
        int summa = summaMedals(medals2);
        System.out.println("Сумма медального зачёта новой второй команды: " + summa);
        System.out.println();
        return summa;
    }

    public static int[] inputMedals() {
        int[] medals = new int[5];
        Scanner console = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("medals1.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (int i = 0; i < medals.length; i++) {
                medals[i] = console.nextInt();
                bufferWriter.write(""+medals[i]);
                bufferWriter.newLine();
            }
            bufferWriter.newLine();
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        return medals;
    }

    public static int summaMedals(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}