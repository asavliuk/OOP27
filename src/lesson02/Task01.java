package lesson02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 12.07.16
 * OOP2
 */
public class Task01 {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("/Users/tigris765/desktop/design/java/text.txt");


//        while (reader.read()!=-1){
//
//           System.out.print((char) reader.read());
//
//        }


//        int ch;
//        String res = "";
//        while ((ch = reader.read())!=-1){
//
//            res+=(char)ch;
//
//            System.out.print(res);
//        }




        char[] ChArray =new char[10];
        int count;


        StringBuilder builder =new StringBuilder(); // this is dinamic string, you can chang this line

        while ((count=reader.read(ChArray))!=-1){

//            String part = new String(ChArray,0,count);

            builder.append(ChArray,0,count);

        }
        String resalt = builder.toString();

        System.out.println(resalt);

    }
}
