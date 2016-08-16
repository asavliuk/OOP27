package lesson02;

import java.io.*;
import java.util.Scanner;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 12.07.16
 * OOP2
 */
public class Task03 {
    public static void main(String[] args) throws IOException {
        for (int i=0; i< args.length; i++){
            System.out.println(args[i]);


        }

        FileWriter writer = new FileWriter(args[1],true);
        FileReader reader = new FileReader(args[0]);

        Scanner scanner = new Scanner(reader);


        while (scanner.hasNextLine()){
            writer.write(scanner.nextLine());
            writer.write(System.lineSeparator());
        }

        writer.flush();
        writer.close();


    }
}
