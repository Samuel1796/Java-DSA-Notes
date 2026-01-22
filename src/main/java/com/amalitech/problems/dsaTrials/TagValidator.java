package com.amalitech.problems.dsaTrials;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TagValidator {

    public static List <String> tracker = new ArrayList();


    public static void TagValidatorCompute (String value){


        if (value.length() < 6){
                tracker.add("Length");
        }
        if (!value.matches(".*[A-Z].*")){
            tracker.add("Clan");
        }
        if (!value.matches(".*[a-z].*")){
            tracker.add("Name");
        }
        if (!value.matches(".*[0-9].*")){
            tracker.add("Rank");
        }
        if (!value.matches(".*[!@#$%^&*()_+-=[//]{}|;:,.<>?].*")){
            tracker.add("Icon");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String tag = sc.nextLine();
        TagValidatorCompute(tag);

        if (tracker.isEmpty()){
            System.out.println("Gold tag");
        } else if (tracker.size() <=2 && !tracker.isEmpty()){
            System.out.println("Silver tag");
            System.out.print("Missing ");
            for (String tag2 : tracker){
                System.out.print(tag2);
            }
        }else {
            System.out.println("Bronze tag");
            System.out.print("Missing");
            for (String tag2 : tracker){
                System.out.print( " " + tag2);
            }
        }
    }
}

