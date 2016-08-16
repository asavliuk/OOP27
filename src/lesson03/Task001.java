package lesson03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 18.07.16
 * OOP2
 */
public class Task001 {
    public static void main(String[] args) {

        int[] array = {9, 2, 3, 4, 5, 6, 1, 8};
        bubbleSort(array);

//        System.out.println(Arrays.toString(array));

//        System.out.print("Bubble Sort : {");
//        for (int k = 0; k < array.length; k++) {
//            System.out.print("\t " + array[k]);
//        }
//        System.out.print("\t}");

    }

    public static void bubbleSort(int[] array) {
        boolean hasChange = true;


        for (int i = 0; hasChange; i++) {

            hasChange = false;

            System.out.println(Arrays.toString(array));
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int buff = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buff;

                    hasChange=true;
                }
            }
           // if(!hasChange)return; //если false то остановить

        }
    }

}
