package lesson02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 12.07.16
 * OOP2
 */
public class Task02 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("/Users/tigris765/desktop/design/java/text.txt");

        Scanner scanner =new Scanner(reader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }



}
