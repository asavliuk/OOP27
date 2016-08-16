package lesson02.hw01;


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


//Читаем строку из файла - пишем в другой файл перевернутую строку.

public class Home001 {
    public static void main(String[] args) throws IOException {


        FileReader fileReader = new FileReader("/Users/tigris765/desktop/design/java/text1.txt");
        Scanner scanner = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("/Users/tigris765/desktop/design/java/Home001.txt");

       // String revers = new StringBuilder(scanner.nextLine()).reverse().toString();

        while (scanner.hasNextLine()) {

            String revers = new StringBuilder(scanner.nextLine()).reverse().toString();
            fileWriter.write(revers);

        }

        fileWriter.flush();
        fileWriter.close();

    }
}
