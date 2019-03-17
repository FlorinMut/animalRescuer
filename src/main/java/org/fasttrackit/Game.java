package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Animal dog;
    Rescuer rescuer;
    Veterinarian veterinarian;

    private List <AnimalFood> availableFood = new ArrayList<>();
    private Activity[] activities = new Activity[10];

    public void start (){  //apelam metoda Start care va rula metodele de jos
        initFood(3);
        displayFood();
        addActivities();
        displayAvailableActivities();
    }

    private void initFood(int FoodCount){  // adaugarea in lista
        for (int i=0; i < FoodCount; i++){
             AnimalFood animalFood = new AnimalFood();
             availableFood.add(animalFood);}
    }

    private void addActivities(){
        Activity activity1 = new Activity("Running");
        Activity activity2 = new Activity("Swimming");

        activities[0] = activity1;
        activities[1] = activity2;
        }

    private void displayFood() {  // citirea din lista
        System.out.println("The available foods are: ");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(availableFood.get(i).getFoodName());}

    }

    private void displayAvailableActivities(){
        System.out.println("The available activities are: ");
        System.out.println(activities[0].getActivityName());
        System.out.println(activities[1].getActivityName());
    }


}




