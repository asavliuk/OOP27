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

//         Пишем программу, которая заменит все "нецензурные слова" в файле на [вырезано цензурой],
//         пишем в тот же файл результат. "нецензурные слова" программа считывает из другого файла.

public class Home004 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/tigris765/desktop/design/java/HomePart1004.txt");
        Scanner scanner = new Scanner(fileReader);

        FileReader fileReader1 = new FileReader("/Users/tigris765/desktop/design/java/trash.txt");
        Scanner scanner1 = new Scanner(fileReader1);

        FileWriter fileWriter =new FileWriter("/Users/tigris765/desktop/design/java/HomePart2004.txt");

StringBuilder b=new StringBuilder();

       while (scanner.hasNextLine()){

            String wtf = scanner.nextLine();
            String []splitWtf =wtf.split("");

            String  trash = scanner1.nextLine();
            String[] splitTrash =trash.split(" ");


            for (int i=0; i<splitWtf.length; i++) {

                   for (int j=0; j<splitTrash.length; j++){
                       if (splitWtf[i].equalsIgnoreCase(splitTrash[j])){

                            splitWtf[i]="[вырезано цензурой] ";
                        //  fileWriter.write (splitWtf[i].replaceAll(splitTrash[j], "[вырезано цензурой]"));
                       }
                    }

                b.append(splitWtf[i]);
                b.append(System.lineSeparator());

            }

           String str=b.toString();
           fileWriter.write(str);


    }
//        fileWriter.write(System.lineSeparator());

        fileWriter.flush();
        fileWriter.close();


    }
}
