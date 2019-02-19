import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Dog dog1 = new Dog();

        System.out.print("Dog's name: ");

        dog1.name = scan.next();

        System.out.print("Dog's age: ");

        dog1.age = scan.nextByte();

        System.out.print("Dog's breed: ");

        dog1.breed = scan.next();


        LittleGirl girl1 = new LittleGirl();

        System.out.print("Little girl's name: ");

        girl1.name = scan.next();

        System.out.print("Little girl's age: ");

        girl1.age = scan.nextByte();


        Veterinarian vet1 = new Veterinarian();

        System.out.print("Vet's name: ");

        vet1.name = scan.next();

        System.out.print("Vet's age: ");

        vet1.age = scan.nextByte();

        System.out.print("Vet's gender: ");

        vet1.gender = scan.next();


        girl1.askHelp();

        vet1.suggestTreatment();


    }
}
