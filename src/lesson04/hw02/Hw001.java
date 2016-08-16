package lesson04.hw02;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 20.07.16
 * OOP2
 */
public class Hw001 {
    public static void main(String[] args) {

        System.out.println(pow(4,3));
        //pow(2,3);

    }


    public static int pow(int num, int pow){


        if (pow==0){

            return 1;
        }

        return num*pow(num,pow-1);

    }
}
