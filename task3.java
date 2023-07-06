package org.example.homework;
import java.io.*;
public class Task003 {
    public static void main(String[] args) {
        File goodFile = new File("good_file.txt");
        File badFile = new File("bad_file.txt");
        File missingFile = new File ("miss_file.txt");
        System.out.print("Корректный файл: ");
        sumNumsInFile(goodFile);
        System.out.println("\nФайл содержит строковое значение: ");
        sumNumsInFile(badFile);
        System.out.println("\nНесуществующий файл: ");
        sumNumsInFile(missingFile);
    }

    public static void sumNumsInFile(File file){
        int result = 0;
        try {
            Reader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()){
                result += Integer.parseInt(br.readLine());
            }
            System.out.print(result + "\n");
        }catch (FileNotFoundException e){
            System.out.println("Ошибка при открытии файла!");

        }catch (IOException e){
            System.out.println("Ошибка чтения из файла!");
        }catch (NumberFormatException e){
            System.out.println("Некорректное значение числа в файле!");
        }
    }
}
