package org.fasttrackit;

    import java.util.Date;


public class App {

    public static void main( String [] args ) {

        Animal animal = new Animal();
        animal.name ="Dog";
        animal.age = 3;
        animal.healthLevel = 10;
        animal.joynessLevel = 10;
        animal.favoriteFood = "Chappie";
        animal.favoriteRecreationalActivity = "Eating";

        Adopter adopter = new Adopter("Gigi",100); //dupa creare constructor adapter, are deja nume aici, mai punem sau le stergem cele de jos?
        adopter.name = "Gigi";
        adopter.budget = 1500;

        Cat cat = new Cat("Blue");



        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Johnny";
        veterinarian.specialization = "Surgeon";

        AnimalFood animalFood = new AnimalFood("beef");
        animalFood.foodAvailability = true;

        RecreationalActivity recreationalActivity = new RecreationalActivity("walking");
        recreationalActivity.activityName = "Walking";


    }


}
