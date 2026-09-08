package service;

import java.util.List;
import java.util.Set;

import entity.Pet;
import exception.DuplicatePetException;
import exception.InvalidPetException;
import exception.PetNotFoundException;

public interface PetService {

    void addPet(Pet pet)
            throws DuplicatePetException,
                   InvalidPetException;

    List<Pet> getAllPets();

    Pet getPet(String nickname)
            throws PetNotFoundException;

    void feedPet(String nickname)
            throws PetNotFoundException;

    void playWithPet(String nickname)
            throws PetNotFoundException;

    void sleepPet(String nickname)
            throws PetNotFoundException;

    void giveMedicine(String nickname)
            throws PetNotFoundException;

    void deletePet(String nickname)
            throws PetNotFoundException;

    Set<String> getPetTypes();
}