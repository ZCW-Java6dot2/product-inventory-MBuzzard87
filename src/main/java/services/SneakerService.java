package services;
import models.Sneaker;
import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private static List<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand, String sport, double size, int quantity, float price) {

        // (2)
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        // (3)
        inventory.add(createdSneaker);

        // (4)
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        return inventory.get(id);
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Sneaker[] findAll(int nextId) {
        Sneaker[] newArr = new Sneaker[inventory.size()];


        return inventory.toArray(newArr);
        // should return a basic array copy of the ArrayList
    }

    //delete
    public Sneaker delete(int id) {
         return inventory.remove(id);

        // should remove the object with this id from the ArrayList if exists and return true.
        // Otherwise return false
    }
}
