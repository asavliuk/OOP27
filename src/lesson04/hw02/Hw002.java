package lesson04.hw02;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 25.07.16
 * OOP2
 */

//        int sum(int val) - Метод возвращает сумму всех цифр числа
//        Пример :  int res = sum(1234); // res = 10

public class Hw002 {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }



    public static int sum(int n){
        return n == 0 ? 0 : sum(n / 10) + (n % 10);

//        if (n==0){
//            return n;
//        }
//
//        return sum(n/10)+(n%10);
    }


}
