package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswer = 0;
        int countQuiz = 5;

        System.out.println("Розпочинаємо перевірку знань таблиці множення!");
        System.out.println("Спробуйте відповісти на " + countQuiz + " запитань.");
        System.out.println("----------------------------------------");

        for(int i = 0; i < countQuiz; i++)
        {
            int One = random.nextInt(8) + 2;
            int Two = random.nextInt(8) + 2;

            int resault = One * Two;

            System.out.print("Скільки буде: " + One + " * " + Two + " = ");

            int userAnswer = scanner.nextInt();

            if(userAnswer == resault)
            {
                System.out.println("Правильно!");
                correctAnswer++;
            }
            else
            {
                System.out.println("Спробуй інше питання!");
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("Тест завершено!");
        System.out.println("Правельних відповідей " + correctAnswer + " з " + countQuiz);
    }
}