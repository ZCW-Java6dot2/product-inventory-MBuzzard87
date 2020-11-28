package services;

import models.Guitar;
import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class GuitarService {

    private static Integer nextId = 1;
    private static List<Guitar> inventory = new ArrayList<Guitar>();

    public static Guitar create(String name, String brand, String model, int quantity, float price) {

        // (2)
        Guitar createdGuitar = new Guitar(nextId++, name, brand, model, quantity, price);

        // (3)
        inventory.add(createdGuitar);

        // (4)
        return createdGuitar;
    }

    //read
    public Guitar findGuitar(int id) {
        return inventory.get(id);
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Guitar[] findAll(int nextId) {
        Guitar[] newArr = new Guitar[inventory.size()];


        return inventory.toArray(newArr);
        // should return a basic array copy of the ArrayList
    }

    //delete
    public Guitar delete(int id) {
        return inventory.remove(id);

        // should remove the object with this id from the ArrayList if exists and return true.
        // Otherwise return false
    }



}
