package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Animal dog;
    Rescuer rescuer;
    Veterinarian veterinarian;

    private List <AnimalFood> availableFood = new ArrayList<>();
    private Track[] tracks = new Track[10];

    private void initFood(int FoodCount){
        for (int i=0; i < FoodCount; i++);
        AnimalFood animalFood = new AnimalFood();
        availableFood.add(animalFood);
    }

    }




