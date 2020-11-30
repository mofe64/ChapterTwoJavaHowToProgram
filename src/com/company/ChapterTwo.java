package com.company;

public class ChapterTwo {
    public void arithmetic(int number1, int number2) {
        System.out.println("Results are as follows : " + "\n" +
                "sum ---> " + (number1 + number2) + "\n" +
                "product ---> " + (number1 * number2) + "\n" +
                "difference --->" + (number1 - number2) + "\n" +
                "quotient ---> " + (number1 / number2));
    }

    public void arithmeticSmallestAndLargest(int number1, int number2, int number3) {
        int[] numArray = {number1, number2, number3};
        int largest = number1;
        int smallest = number1;
        for (int num : numArray) {
            if (largest < num) {
                largest = num;
            }
            if (smallest > num) {
                smallest = num;
            }
        }
        System.out.println("Results are as follows : " + "\n" +
                "sum ---> " + (number1 + number2 + number3) + "\n" +
                "product ---> " + (number1 * number2 * number3) + "\n" +
                "average --->" + ((number1 + number2 + number3) / 3) + "\n" +
                "smallest ---> " + smallest + "\n" +
                "largest ----> " + largest);
    }

    public void comparingIntegers(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + "Is larger");
        } else if (number1 == number2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println(number2 + "IS larger");
        }
    }

    public void largestAndSmallestIntegers(int number1, int number2, int number3, int number4, int number5) {
        int[] numArray = {number1, number2, number3, number4, number5};
        int largest = number1;
        int smallest = number1;

        for (int num : numArray) {
            if (largest < num) {
                largest = num;
            }
            if (smallest > num) {
                smallest = num;
            }
        }

        System.out.println("Largest is " + largest + "and smallest is " + smallest);
    }

    public void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public void multiples(int number1, int number2) {
        if (number1 % number2 == 0) {
            System.out.println(number1 + "is a multiple of " + number2);
        } else {
            System.out.println(number1 + "is not a multiple of " + number2);
        }
    }


    public void diameterCircumferenceAndAreaOfACircle(int radius) {
        double pi = Math.PI;
        System.out.println("Diameter is ---> " + (radius * 2) + "\n" +
                "circumference is ---> " + (2 * pi * radius) + "\n" +
                "area is ---> " + (pi * radius * radius));
    }

    public void integerValueOfACharacter() {
        char[] characterArray = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
        for (char character : characterArray) {
            System.out.println("Integer Values of " + character + "is " + (int) character);
        }
    }

    public void separatingDigitsInAnInteger(int digit) {
        String stringVersionOfDigit = Integer.toString(digit);
        for (int i = 0; i < stringVersionOfDigit.length(); i++) {
            System.out.println(" " + stringVersionOfDigit.charAt(i) + " ");
        }
    }

    public void bodyMassIndexCalculator(int weightInPounds, int heightInInches) {
        double BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
        System.out.println("Body mass index is " + BMI + "\n" +
                "BMI VALUE \n" +
                "UnderWeight: less than 18.5\n" +
                "Normal: between 18.5 and 24.9\n" +
                "Overweight: between 25 and 29.9 \n" +
                "Obese: 30 or greater");
    }

    public void worldPopulationGrowthCalculator() {
        long worldCurrentPopulation = 7_800_000_000L;
        double worldPopulationGrowthRate = 1.1;
        long worldYearlyGrowthRate = (int) (worldPopulationGrowthRate * worldCurrentPopulation) / 100;
        System.out.println("Current world population is " + worldCurrentPopulation + "\n" +
                "World population after 1 year is " + (worldCurrentPopulation + worldYearlyGrowthRate) + "\n" +
                "World population after 2 years is " + (worldCurrentPopulation + (worldYearlyGrowthRate * 2)) + "\n" +
                "World population after 3 years is " + (worldCurrentPopulation + (worldYearlyGrowthRate * 3)) + "\n" +
                "World population after 4 years is " + (worldCurrentPopulation + (worldYearlyGrowthRate * 4)) + "\n" +
                "World population after 5 years is " + (worldCurrentPopulation + (worldYearlyGrowthRate * 5)) + "\n");
    }

    public void carPoolSavingsCalculator(int totalMilesDrivenPerDay, int costPerLitreOfFuel, int averageMilesPerLitre, int parkingFeesPerDay, int tollsPerDay) {
        int dailyDriveCost = (totalMilesDrivenPerDay / averageMilesPerLitre) * costPerLitreOfFuel + parkingFeesPerDay + tollsPerDay;
        System.out.println("Daily cost of driving is " + dailyDriveCost);
    }
    public void checkerboard(){
        System.out.println("********\n ********\n********\n ********\n********\n ********");
    }
}
