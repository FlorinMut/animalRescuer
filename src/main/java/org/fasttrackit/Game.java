package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    Animal dog;
    Rescuer rescuer;
    Veterinarian veterinarian;

    private List <AnimalFood> availableFood = new ArrayList<>();
    private Activity[] activities = new Activity[10];

    public void start () throws Exception {  //apelam metoda Start care va rula metodele de jos
        initFood(3);
        displayFood();
        addActivities();
        displayAvailableActivities();
        initAnimal();
        //initRescuer();
    }
    private void initAnimal(){
        Animal dog = new Dog();
        dog.age = 10;
        dog.name = "Tudor";
        dog.healthLevel = 4;
        dog.hungerLevel = 5;
        dog.joynessLevel = 6;
        dog.favoriteFood = "KFC";
        dog.favoriteRecreationalActivity = "Eating";
    }

    /*private String initRescuer() throws Exception {
        Rescuer rescuer = new Rescuer("Csabi",200);
        System.out.println("Please enter your name ");
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            System.out.println("My name is " + name);
            return name;

        } catch(InputMismatchException exception) {
            throw new Exception ("String is required");
        }


    }*/

    private void initFood(int FoodCount) throws Exception {  // adaugarea in lista a felurilor de mancare
        for (int i=0; i < FoodCount; i++){
            AnimalFood animalFood = new AnimalFood();
             availableFood.add(animalFood);}
        System.out.println("Number of food is ");
        Scanner scanner = new Scanner(System.in);
        try {
            int foodPrice = scanner.nextInt();
            System.out.println("Number of foods is ");
        } catch (InputMismatchException exception){
            throw new Exception("Integer required");

        }

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
        ///System.out.println(activities[0].getActivityName());
        ///System.out.println(activities[1].getActivityName());

        //enhanced FOR
        for (Activity activity: activities) {
            if (activity !=null) {
                System.out.println(activity.getActivityName());
            }
        }

    }


}




