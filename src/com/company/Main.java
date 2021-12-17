package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Student> studentArrayList = new ArrayList<>();

        while (true){
            System.out.println("Введите 1, чтобы добавить нового студента");
            System.out.println("Введите 2, чтобы получить средний показатель группы");
            System.out.println("Введите 3, чтобы получить список студентов");
            System.out.println("Введите 4, чтобы информацию по конкретному студенту");
            System.out.println("Введите 5, чтобы выйти");
            int x = Integer.parseInt(reader.readLine());
            if (x == 5) break;
            switch (x) {
                case 1:
                    String name = reader.readLine();
                    int age = Integer.parseInt(reader.readLine());
                    int score = Integer.parseInt(reader.readLine());
                    studentArrayList.add(new Student(name, age, score));
                    break;
                case 2:
                    int sum = 0;
                    for (Student a : studentArrayList){
                        sum += a.getScore();
                        }
                    float averageScore = sum / studentArrayList.size();
                    System.out.println(averageScore);
                    break;
                case 3:
                    int i = 1;
                    for (Student a : studentArrayList) {
                    System.out.println(i + ". " + a.getName());
                    i += 1;
                    }
                    break;
                case 4:
                System.out.println("Введите номер студента, информацию о котором вы хотите получить");
                int studentNum = Integer.parseInt(reader.readLine()) - 1;
                System.out.println(studentArrayList.get(studentNum).getAge());
                System.out.println(studentArrayList.get(studentNum).getName());
                System.out.println(studentArrayList.get(studentNum).getScore());
                break;
            }
        }
    }
}