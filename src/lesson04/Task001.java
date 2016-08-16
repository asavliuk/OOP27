package lesson04;

import java.util.Arrays;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 19.07.16
 * OOP2
 */


public class Task001 {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 5, 6, 4, 8};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectionSort(int[] array){


        for(int j = 0; j<array.length-1; j++){

            int minIndex = j;

            System.out.println(Arrays.toString(array));

             for (int i =j+1; i<array.length; i++){
                 if (array[i]<array[minIndex]){
                     minIndex=i;

                 }

            }
            swap(array, j, minIndex);

//            int zam = array[j];
//            array[j] = array[minIndex];
//            array[minIndex] = zam;

        }

    }

    public static void swap(int[] array, int i, int j){

        int zam = array[j];
        array[j] = array[i];
        array[i] = zam;
    }


}
