package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entity.Pet;
import exception.DuplicatePetException;
import exception.InvalidPetException;
import exception.PetNotFoundException;

public class PetServiceImpl implements PetService {

    private ArrayList<Pet> pets;

    private HashMap<String, Pet> petMap;

    private HashSet<String> petTypes;

    public PetServiceImpl() {

        pets = new ArrayList<>();

        petMap = new HashMap<>();

        petTypes = new HashSet<>();
    }

    @Override
    public void addPet(Pet pet)
            throws DuplicatePetException,
                   InvalidPetException {

        if (pet == null) {

            throw new InvalidPetException(
                    "Pet cannot be null."
            );
        }

        if (pet.getNickname() == null ||
                pet.getNickname().isEmpty()) {

            throw new InvalidPetException(
                    "Nickname cannot be empty."
            );
        }

        String key =
                pet.getNickname().toLowerCase();

        if (petMap.containsKey(key)) {

            throw new DuplicatePetException(
                    "A pet with nickname '" +
                    pet.getNickname() +
                    "' already exists."
            );
        }

        pets.add(pet);

        petMap.put(key, pet);

        petTypes.add(
                pet.getPetType()
        );

        System.out.println(
                pet.getNickname() +
                " added successfully!"
        );
    }

    @Override
    public List<Pet> getAllPets() {

        return pets;
    }

    @Override
    public Pet getPet(String nickname)
            throws PetNotFoundException {

        if (nickname == null ||
                nickname.isEmpty()) {

            throw new PetNotFoundException(
                    "Nickname cannot be empty."
            );
        }

        Pet pet =
                petMap.get(
                        nickname.toLowerCase()
                );

        if (pet == null) {

            throw new PetNotFoundException(
                    "Pet '" +
                    nickname +
                    "' not found."
            );
        }

        return pet;
    }

    @Override
    public void feedPet(String nickname)
            throws PetNotFoundException {

        Pet pet =
                getPet(nickname);

        pet.feed();
    }

    @Override
    public void playWithPet(String nickname)
            throws PetNotFoundException {

        Pet pet =
                getPet(nickname);

        pet.play();
    }

    @Override
    public void sleepPet(String nickname)
            throws PetNotFoundException {

        Pet pet =
                getPet(nickname);

        pet.sleep();
    }

    @Override
    public void giveMedicine(String nickname)
            throws PetNotFoundException {

        Pet pet =
                getPet(nickname);

        pet.giveMedicine();
    }

    @Override
    public void deletePet(String nickname)
            throws PetNotFoundException {

        Pet pet =
                getPet(nickname);

        pets.remove(pet);

        petMap.remove(
                nickname.toLowerCase()
        );

        rebuildPetTypes();

        System.out.println(
                pet.getNickname() +
                " has been removed."
        );
    }

    private void rebuildPetTypes() {

        petTypes.clear();

        for (Pet pet : pets) {

            petTypes.add(
                    pet.getPetType()
            );
        }
    }

    @Override
    public Set<String> getPetTypes() {

        return petTypes;
    }
}