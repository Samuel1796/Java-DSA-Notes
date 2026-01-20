package com.amalitech.problems.dsaTrials;

import java.util.Scanner;

public class LicensePlate {

    public static String validateNumberPlate(String input) {
        // Check for invalid characters BEFORE cleaning
        if (!input.matches("[A-Za-z0-9\\s\\-_]*")) {
            return "Invalid\nReasons: Invalid characters";
        }

        // Clean the input - remove separators
        String formattedInput = input.replace("-", "")
                .replace("_", "")
                .replace(" ", "").toUpperCase();

        String regionCode = "";
        String mainCode = "";

        // Check for region code
        if (formattedInput.length() == 8) {
            regionCode = formattedInput.substring(0, 2);
            mainCode = formattedInput.substring(2);
        } else if (formattedInput.length() == 6) {
            mainCode = formattedInput;
        } else {
            return "Invalid\nReasons: Wrong character count";
        }

        // Invalid region code check
        if (!regionCode.isEmpty() && !regionCode.matches("[A-Z]{2}")) {
            return "Invalid\nReasons: Invalid region code";
        }

        // Invalid mainCode check
        if (!mainCode.matches("[A-Z0-9]{6}")) {
            return "Invalid\nReasons: Invalid characters";
        }

        // Counting of letters and digits
        int digitCount = 0;
        int letterCount = 0;

        for (char c : mainCode.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // minimum letter requirement
        if (letterCount < 2) {
            return "Invalid\nReasons: Insufficient letters";
        }

        // minimum digit requirement
        if (digitCount < 2) {
            return "Invalid\nReasons: Insufficient digits";
        }

        // format valid plates
        String formatted = mainCode.substring(0, 3) + "-" + mainCode.substring(3);
        if (!regionCode.isEmpty()) {
            formatted = regionCode + "-" + formatted;
        }

        return formatted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the plate code: ");
        String plate = sc.nextLine();

        System.out.println(validateNumberPlate(plate));

        sc.close();
    }
}