//package lesson01;
//
//import java.util.ArrayList;
//
///**
// * Asavliuk Ivan
// * asavliuk@gmail.com
// * 11.07.16
// * OOP2
// */
//public class Task1 {
//
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        System.out.println(list.size());
//
//        list.add(3);
//        list.add(5);
//        list.add(2);
//        list.add(4);
//
//
//
//        list.removeIf((elem)->elem%2!=0); // jast for JAVA 1.8 like method removeAllOdd
//
//        list.forEach(e -> System.out.println("\t"+e)); // like For Each
//
//        //   removAllOdd(list);
//
//        System.out.println(list);
//    }
//
////    public static Integer sum(Integer[][]array){
////        Integer result =0;
////        for (int i=0; i<array.length; i++){
////            result+=array[i];
////        }
////        return result;
////    }
//
//
//    public static void removAllOdd(ArrayList<Integer> list){
//
//        for (int i = 0; i<list.size();i++){
//            if (list.get(i)%2!=0){
//                list.remove(i);
//                i--;
//            }
//        }
//    }
//}
