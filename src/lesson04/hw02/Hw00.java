package lesson04.hw02;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 20.07.16
 * OOP2
 */
public class Hw00 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int f){

        if (f==1){
            System.out.print("Factorial : ");
            return 1;
        }

        return  factorial(f-1)*f;


    }
}
