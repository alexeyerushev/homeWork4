package src;

import java.util.Scanner;

public class mainPerson1 {
    public static <String> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inter your name: ");
        String name = (String) scanner.nextLine();

        System.out.print("Inter your middle name: ");
        String middleName = (String) scanner.nextLine();

        System.out.print("Inter your family name: ");
        String familyName = (String) scanner.nextLine();

        Person1 person1 = new Person1(name, middleName, familyName);

        System.out.println("You create new object: " + person1);

    }
}
