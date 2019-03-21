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

    public void start () throws Exception  {  //apelam metoda Start care va rula metodele de jos
       initFood();
       displayFood();
        //addActivities();
        //displayAvailableActivities();
        //initAnimal(1);
        //initRescuer();
        //requireFeeding();


    }
    private void initAnimal(int animalCount){
        /*Animal dog = new Dog();
        dog.age = 10;
        dog.name = "Tudor";
        dog.healthLevel = 4;
        dog.hungerLevel = 5;
        dog.joynessLevel = 6;
        dog.favoriteFood = "KFC";
        dog.favoriteRecreationalActivity = "Eating"; */
        //for (int i=0; i < animalCount; i++){
            dog = new Dog();
            dog.setName(nameAnimal());


    }

    private String nameAnimal(){
        System.out.println("Please enter the dog's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your dog's name is: " + name);
        return name;
    }

    private String initRescuer() throws Exception {
        rescuer = new Rescuer("Csabi",200);
        System.out.println("Please enter your name ");
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            System.out.println("My name is " + name);
            return name;

        } catch(InputMismatchException exception) {
            throw new Exception ("String is required");
        }

    }

    private void requireFeeding() throws Exception {
        for (int i = 0; i <= availableFood.size(); i++){
            System.out.println("Choose the food:");
            Scanner scanner = new Scanner(System.in);
            String x = scanner.nextLine();
            //System.out.println(dog.getName());
            System.out.println(availableFood.get(i).getFoodName());
            //System.out.println(rescuer.getName());
            rescuer.feedAnimal(dog,availableFood.get(i));
            System.out.println("Animal is fed");

        }
            /*int z=0;
        while (z == 0) {
            try {
                int x = scanner.nextInt();
                if((x>0) && (x <= availableFood.size())) {
                   // System.out.println(dog.getName());
                   // System.out.println(availableFood.size());
                   // System.out.println(availableFood.get(x-1).getFoodName());
                   // System.out.println(rescuer.getName());
                    rescuer.feedAnimal(dog,availableFood.get(x-1));
                    System.out.println("Animal is fed");
                    z=1;
                }else{
                    System.out.println("Please re-enter, out of list");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please re-enter");
            }
            catch (IndexOutOfBoundsException exception){
                throw new Exception ("Number out of range, keep trying");
            }

        }*/

    }

    /*private void requirePlaying(){
        System.out.println("Choose the activity:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if ((x>0) && (x < activities.length)) {
            rescuer.entertainAnimal(dog,activities.length(x-1));

        }

    }*/

    private void initFood() throws Exception {  // adaugarea in lista a felurilor de mancare
       // for (int i=0; i < FoodCount; i++){
           AnimalFood animalFood1 = new AnimalFood(); //creare obiect 1 in lista
           AnimalFood animalFood2 = new AnimalFood(); //creare obiect 2 in lista
            //animalFood.setFoodName(String.valueOf(i));
             availableFood.add(animalFood1); //adaugare obiect 1 in lista
             availableFood.add(animalFood2); //adaugare obiect 2 in lista
             animalFood1.setFoodName("KFC"); //denumire obiect 1 din lista
             animalFood2.setFoodName("Chappie"); //denumire obiect 2 din lista
        /*System.out.println("Number of food is ");
        Scanner scanner = new Scanner(System.in);
        try {
            int foodName = scanner.nextInt();
            System.out.println("Number of foods is ");
        } catch (InputMismatchException exception){
            throw new Exception("Integer required");

        }*/

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




