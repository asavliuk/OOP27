package lesson04;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 19.07.16
 * OOP2
 */

// рекурсия

public class Task002 {

    public static void main(String[] args) {

        f(0,5);
        System.out.println();
        System.out.println(sum(1,3));

        System.out.println("Factorial : "+factorial(5));


    }
    /* Виводімо числа по порядку й назад
     * наприклад 1 2 3 4 5 4 3 2 1 */
    public static void f(int count, int size) {
        System.out.print(count+", "); //Виводить 0 1 2 3 4 5

        if (count==size) {
            return;
        }
        f(count+1, size);
        System.out.print(count+", "); // Виводить 4 3 2 1 0

    }

    /* Пошук Суми чисел */
    public static int sum(int start, int end){


        if (start==end){
            System.out.print(start+" = ");
            return end;
        }
        System.out.print(start+" + ");
        return start+sum(start+1,end);
    }


    /* Пошук Фактоіала */
    public static int factorial(int f){
        if (f==1){

            return 1;
        }

        return  factorial(f-1)*f;

    }


}
