package lesson04.hw02;

import java.util.Arrays;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 25.07.16
 * OOP2
 */

/*
   (Повышенной сложности). void permute(int[] arr, int idx) - метод выводит в консоль все возможные варианты
                                                              перестановок значений данного массива.
        Пример :
        int[] arr = {1, 2, 3};
        permute(arr, 0);
    // В консоли :
        [1, 2, 3]
        [1, 3, 2]
        [2, 1, 3]
        [2, 3, 1]
        [3, 2, 1]
        [3, 1, 2]*/

public class Hw005 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        permute(arr, 0);
    }


    public static void permute(int[] arr, int idx){

        if (idx == arr.length -1) {
            System.out.println(Arrays.toString(arr));
        }

        for (int i = idx; i < arr.length; i++) {
//            int per = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = per;

            swap(arr,idx,i); // аналог
            permute(arr, idx+1);
            swap(arr,idx,i);

//            int per1 = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = per1;

        }

    }

    public static void swap(int[] array, int i, int j){

        int zam = array[j];
        array[j] = array[i];
        array[i] = zam;
    }




}
