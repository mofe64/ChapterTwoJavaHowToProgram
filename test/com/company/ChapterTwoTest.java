package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterTwoTest {
    ChapterTwo chapterTwo;

    @BeforeEach
    void setUp() {
        chapterTwo = new ChapterTwo();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void arithmetic() {
        chapterTwo.arithmetic(10,30);
    }

    @Test
    void arithmeticSmallestAndLargest() {
        chapterTwo.arithmeticSmallestAndLargest(10,30,90);
    }

    @Test
    void comparingIntegers() {
        chapterTwo.comparingIntegers(10,89);
    }

    @Test
    void largestAndSmallestIntegers() {
        chapterTwo.largestAndSmallestIntegers(1000,90,768,89,9);
    }

    @Test
    void oddOrEven() {
        chapterTwo.oddOrEven(7);
    }

    @Test
    void multiples() {
        chapterTwo.multiples(9,3);
    }

    @Test
    void diameterCircumferenceAndAreaOfACircle() {
        chapterTwo.diameterCircumferenceAndAreaOfACircle(10);
    }

    @Test
    void integerValueOfACharacter() {
        chapterTwo.integerValueOfACharacter();
    }

    @Test
    void separatingDigitsInAnInteger() {
        chapterTwo.separatingDigitsInAnInteger(1783909301);
    }

    @Test
    void bodyMassIndexCalculator() {
        chapterTwo.bodyMassIndexCalculator(187,74);
    }

    @Test
    void worldPopulationGrowthCalculator() {
        chapterTwo.worldPopulationGrowthCalculator();
    }

    @Test
    void carPoolSavingsCalculator() {
        chapterTwo.carPoolSavingsCalculator(5,156,1,400,1000);
    }

    @Test
    void checkerboard() {
        chapterTwo.checkerboard();
    }
}