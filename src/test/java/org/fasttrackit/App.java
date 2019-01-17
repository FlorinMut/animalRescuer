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

        Adopter adopter = new Adopter();
        adopter.name = "Gigi";
        adopter.budget = 1500;

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Johnny";
        veterinarian.specialization = "Surgeon";

        AnimalFood animalFood = new AnimalFood();
        animalFood.foodAvailability = true;

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.activityName = "Walking";


    }


}
