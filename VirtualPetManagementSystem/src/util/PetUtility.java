package util;

import java.util.List;
import java.util.Set;

import entity.Pet;

public class PetUtility {

    public static void displayPets(
            List<Pet> pets) {

        if (pets.isEmpty()) {

            System.out.println(
                    "No pets available."
            );

            return;
        }

        for (Pet pet : pets) {

            pet.showStatus();
        }
    }

    public static void displayPetTypes(
            Set<String> types) {

        if (types.isEmpty()) {

            System.out.println(
                    "No pet types registered."
            );

            return;
        }

        System.out.println(
                "\nRegistered Pet Types:"
        );

        for (String type : types) {

            System.out.println(
                    "- " + type
            );
        }
    }
}