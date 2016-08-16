package lesson06;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 26.07.16
 * OOP2
 */
public class Car {
    String brend;
    Integer rashodOneKm;
    Integer tankMax;
    Integer howeManyFuelWeHave;
    Integer runingCar;
    Boolean startingCar;


    public void printAboutCar(){
        System.out.printf(
                "Марка : %s%n" +
                "Объем бака : %d л.%n" +
                "Расход : %d (на 1км)%n" +
                "Остаток в баке : %d л.%n" +
                "Пробег машины : %d км.%n" +
                "Машина работает: %b%n%n",
                brend,tankMax,rashodOneKm,howeManyFuelWeHave,runingCar,startingCar);
    }
    public void startCar(){
        if (howeManyFuelWeHave>0) {
            startingCar = true;
            System.out.println("Машина заведена, можем ехать");
        }
        if (howeManyFuelWeHave==0){
            System.out.println("Машина не заводиться так как бак пуст");
        }


    }

    public void movieCar(int km){
        int countKm = km;

        while (howeManyFuelWeHave>0&& startingCar && km>0){
            howeManyFuelWeHave -=rashodOneKm;
            km--;
            runingCar++;
        }
        if (howeManyFuelWeHave==0&& startingCar  ){
            startingCar=false;
            System.out.println("Марка : "+brend+"\nБак пуст, вам нужно заправиться на "+tankMax+ "л \nЗавестись вновь\n");
        }
        if (howeManyFuelWeHave>0&& startingCar ){
            System.out.println("Марка :"+brend+"\nMашина проехала "+countKm+"km\n");
        }
        if (!startingCar){
            System.out.println("Заведите Машину");
        }
    }

    public void reFullCar(){
        howeManyFuelWeHave = tankMax-howeManyFuelWeHave;
        System.out.printf("Машина заправленна на %d л%n%n", howeManyFuelWeHave);

    }


//    public Car(String brend, Integer rashodOneKm, Integer tankMax, Integer howeManyFuelWeHave, Integer runingCar, Boolean startingCar){
//        this.brend =brend;
//        this.rashodOneKm=rashodOneKm;
//        this.tankMax=tankMax;
//        this.howeManyFuelWeHave=howeManyFuelWeHave;
//        this.runingCar=runingCar;
//        this.startingCar=startingCar;
//    }





}

