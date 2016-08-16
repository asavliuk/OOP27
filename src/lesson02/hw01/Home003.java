package lesson02.hw01;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 18.07.16
 * OOP2
 */


//Читаем строку из файла, записываем в другой файл ту же строку заменив
// все символы нижнего регистра - символами верхнего, и наоборот.

public class Home003 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader =new FileReader("/Users/tigris765/desktop/design/java/text1.txt");
        Scanner scanner = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("/Users/tigris765/desktop/design/java/Home003.txt");

        while (scanner.hasNextLine()){
            String scanSt = scanner.nextLine();
            char [] ar = scanSt.toCharArray();

            for (int i=0; i<ar.length; i++){

                if(String.valueOf(ar[i]).equals(String.valueOf(ar[i]).toUpperCase())){
                    fileWriter.write(String.valueOf(ar[i]).toLowerCase());

                }
                if (String.valueOf(ar[i]).equals(String.valueOf(ar[i]).toLowerCase())){
                    fileWriter.write(String.valueOf(ar[i]).toUpperCase());
                }

            }
        fileWriter.write(System.lineSeparator());

        }
        fileWriter.flush();
        fileWriter.close();

    }

}
