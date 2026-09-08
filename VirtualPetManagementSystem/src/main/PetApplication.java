package main;

import java.util.Scanner;

import entity.Cat;
import entity.Dog;
import entity.Hamster;
import entity.Pet;
import entity.Rabbit;

public class PetApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet pet = null;

        System.out.println("========================================");
        System.out.println("     VIRTUAL PET MANAGEMENT SYSTEM");
        System.out.println("========================================");

        System.out.println();
        System.out.println("Select Pet Type:");
        System.out.println();
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Hamster");
        System.out.println("4. Rabbit");

        System.out.print("\nEnter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter nickname: ");
        String nickname = sc.next();

        switch (choice) {

            case 1:
                pet = new Dog(nickname);
                break;

            case 2:
                pet = new Cat(nickname);
                break;

            case 3:
                pet = new Hamster(nickname);
                break;

            case 4:
                pet = new Rabbit(nickname);
                break;

            default:
                System.out.println("Invalid pet type.");
                sc.close();
                return;
        }

        System.out.println();
        System.out.println(
                pet.getNickname() +
                " has been created successfully!"
        );

        int option = 0;

        do {

            System.out.println();
            System.out.println("========================================");
            System.out.println("              PET MENU");
            System.out.println("========================================");

            System.out.println(
                    "Pet Name : " + pet.getNickname()
            );

            System.out.println(
                    "Pet Type : " + pet.getPetType()
            );

            System.out.println();
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Give Medicine");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");

            System.out.print("\nEnter choice: ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    pet.feed();
                    break;

                case 2:
                    pet.play();
                    break;

                case 3:
                    pet.sleep();
                    break;

                case 4:
                    pet.giveMedicine();
                    break;

                case 5:
                    pet.showStatus();
                    break;

                case 6:
                    System.out.println();
                    System.out.println(
                            "Thank you for taking care of " +
                            pet.getNickname() + "!"
                    );
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select 1-6."
                    );
            }

        } while (option != 6);

        sc.close();
    }
}