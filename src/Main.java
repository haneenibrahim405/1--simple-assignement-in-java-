import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cat", "Orange", 4.5);
        animal1.setData("Cat", "Orange", 4.5, 4, 2, 2);
        animal1.print();
        System.out.println("-------------------");


        Animal animal2 = new Animal("Dog", "Black");
        animal2.setData("Dog", "Black", 20.0, 4, 2, 2);
        animal2.print();
        System.out.println("-------------------");


        Animal animal3 = new Animal("Bird", "Green", 0.5, 2, 2, 2);
        animal3.print();
        System.out.println("-------------------");


        Animal animal4 = new Animal();
        animal4.setData("Fish", "Blue", 0.3, 0, 0, 2);
        animal4.print();
        System.out.println("-------------------");


        Animal animal5 = new Animal("Elephant", "Gray", 500.0);
        animal5.setData("Elephant", "Gray", 500.0, 4, 2, 2);
        animal5.print();
    }
}
