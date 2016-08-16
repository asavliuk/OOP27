package lesson04.hw02;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 25.07.16
 * OOP2
 */

//        int fib(int val) - метод возвращает значение по порядковому номеру из ряда Фибоначчи.
//        Пример : int res = fib(7) // res = 13;

public class Hw004 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int val){

        if (val==0){
          return 0;
        }
        if (val==1){
            return 1;
        }
        if (val<0){
            System.out.print("Вы ввели отрицательное число :");
            return val;

        }
        return fib(val-1)+fib(val-2);



    }
}
