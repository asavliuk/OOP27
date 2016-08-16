package lesson02.hw01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 14.07.16
 * OOP2
 */



//Читаем строку из файла - пишем в другой файл только
// символы верхнего регистра, которые встречаются в файле

public class Home000 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/tigris765/desktop/design/java/text1.txt");
        Scanner scanner = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("/Users/tigris765/desktop/design/java/Home000.txt");

        while (scanner.hasNextLine()){

            String scanString = scanner.nextLine();
            char [] array = scanString.toCharArray();

            for(int i = 0; i<array.length; i++){

                if (Character.isUpperCase(array[i])){
                    fileWriter.write(array[i]);

                }
            }

            fileWriter.write(System.lineSeparator());


        }
        fileWriter.flush();
        fileWriter.close();
    }
}
