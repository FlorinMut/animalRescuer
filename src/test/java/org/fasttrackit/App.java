package org.fasttrackit;

    import java.util.Date;


public class App {

    public static void main( String [] args ) {

        Animal animal = new Animal();
        animal.setName("Dog");
        animal.setAge(3);
        animal.setHealthLevel(10);
        animal.setJoynessLevel(10);
        animal.setFavoriteFood("Chappie");
        animal.setFavoriteRecreationalActivity("Eating");

        Adopter adopter = new Adopter("Gigi",100); //dupa creare constructor adapter, are deja nume aici, mai punem sau le stergem cele de jos?
        adopter.setName("Gigi");
        adopter.setBudget(1500);

        Cat cat = new Cat("Blue");



        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Johnny");
        veterinarian.setSpecialization("Surgeon");

        AnimalFood animalFood = new AnimalFood("beef");
        animalFood.setFoodAvailability(true);

        RecreationalActivity recreationalActivity = new RecreationalActivity("walking");
        recreationalActivity.setActivityName("Walking");


    }


}
