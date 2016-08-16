package lesson04.hw02;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 25.07.16
 * OOP2
 */

//          void revers(int val) - Метод выводит в консоль число наоборот
//          Пример : revers(1234); // в консоли 4321


public class Hw003 {
    public static void main(String[] args) {
        revers(1234);
    }

    public static void revers(int num){

        if (num == 0){
            return ;
        }

        System.out.print((num%10)+" "); // перевернутий напрямок, тобто REVERS

        revers(num/10);
        //System.out.println(count+", "); //правильний напрямок

    }
}
