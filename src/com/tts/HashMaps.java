package com.tts;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {


    public static void main(String[] args) {
        ;
        //You are a car dealer. Create a hash map of vehicles.
        //The model is the Key, the make is the Value.

        HashMap<String,String> carHash = new HashMap<String, String>();

        carHash.put("PathFinder", "Nissan");
        carHash.put("Leaf", "Nissan");
        carHash.put("Rogue", "Nissan");
        carHash.put("Versa", "Nissan");
        carHash.put("Sentra", "Nissan");
        carHash.put("f150", "Ford");


        Scanner scanner = new Scanner(System.in);
        System.out.println("What model of car were you looking for today?");
        //get user input
        String userInput = scanner.next();

        String checker = carHash.get(userInput);
            if (checker ==null){
                System.out.printf("Sorry we do not have any of those but we do have: %s" , carHash);
            } else {
                for(String allcars : carHash.keySet()){
                if(allcars.equals(userInput)){
                    System.out.printf("Awesome we do have %s 's " , userInput);
                    System.out.println("Our " + carHash.get(allcars) +" selection is right over here");
                }
                }
            }



        //public HashMap<String, String> getCarHash () {

        }

        //Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.

        //(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
    }

