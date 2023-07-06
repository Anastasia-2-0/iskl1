package org.example.homework;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        String input = sc.nextLine();
        try {
            int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Некорректный ввод");
        }
    }
}
