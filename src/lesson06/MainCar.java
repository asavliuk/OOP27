package lesson06;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 26.07.16
 * OOP2
 */
public class MainCar {
    public static void main(String[] args) {

        Car car = new Car();
        car.brend = "BMW";
        car.rashodOneKm =1;
        car.startingCar =false;
        car.howeManyFuelWeHave = 10;
        car.runingCar =0;
        car.tankMax=10;



        Car car1 = new Car();
        car1.brend = "ZAZ";
        car.rashodOneKm =1;
        car1.startingCar =true;
        car1.howeManyFuelWeHave = 10;
        car1.runingCar =0;
        car1.tankMax=10;


        Car car2 = new Car();
        car2.brend = "NISAN";
        car.rashodOneKm =1;
        car2.startingCar =true;
        car2.howeManyFuelWeHave = 10;
        car2.runingCar =0;
        car2.tankMax=10;



        car.printAboutCar();

        car.movieCar(10);
        car.startCar();
        car.movieCar(10);
        car.reFullCar();



//        car.printAboutCar();
//
//        car.reFullCar();
//
//        car.printAboutCar();





    }
}
