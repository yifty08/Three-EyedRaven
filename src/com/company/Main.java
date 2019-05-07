package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> positive = new ArrayList<>();
        positive.addAll(Arrays.asList("great", "good", "glad", "happy", "relaxed",
                "accomplished", "alert", "creative"));
//        System.out.println(positive);

        ArrayList<String> nagative = new ArrayList<>();
        positive.addAll(Arrays.asList("mad", "bad", "sad", "tired", "angry",
                "anxious", "hungry", "moody", "afraid"));

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        System.out.print("Hi I'm Raven, Eliza's Emo cousin." +
                " How are you feeling today? ");

        int posCounter = 0;
        int nagCounter = 0;

        while (!(answer.equalsIgnoreCase("q"))){

            System.out.println("Enter your response here or q to quit: ");
            answer = scanner.nextLine();
//            System.out.println(answer);

            for (String a : answer.split(" ")) {

                for (String p : positive) {
                    if (a.equalsIgnoreCase(p)) {
                        posCounter++;
                    }

                }
//                System.out.println(posCounter);

                for (String n : nagative) {
                    if (a.equalsIgnoreCase(n)) {
                        nagCounter++;
                    }

                }
            }

            if (posCounter > nagCounter){
                System.out.println("I am so happy you are happy!!");
            } else if (posCounter < nagCounter) {
                System.out.println("Really! Why, tell me more!");
            } else {
                System.out.println("Meh...");
            }
//            System.out.println(posCounter);
//            System.out.println(nagCounter);
        }


    }
}
