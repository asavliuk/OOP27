package lesson05;

/**
 * Asavliuk Ivan
 * asavliuk@gmail.com
 * 25.07.16
 * OOP2
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.age = 20;
        person1.name = "Vasia";

        Person person2 = new Person();

        person2.age = 40;
        person2.name = "Pedro";

        Person person3 = new Person();

        person1.print();
        person2.print();
        person3.print();


//        printPerson(person1);
//        printPerson(person2);



    }

    public static void printPerson(Person p) {
        System.out.println(p.name+"\t"+p.age);
    }

}
