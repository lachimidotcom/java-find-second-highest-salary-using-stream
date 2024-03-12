package com.salaryfinder.stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondHighestSalaryTest {

    @Test
    void testFindSecondLargestSalary_NormalCase() {
        Integer[] salaries = {500, 600, 700, 800, 900};
        assertEquals(800, SecondHighestSalary.findSecondLargestSalary(salaries));
    }

    @Test
    void testFindSecondLargestSalary_WithDuplicates() {
        Integer[] salaries = {500, 500, 600, 600, 700, 700, 800, 800, 900, 900};
        assertEquals(800, SecondHighestSalary.findSecondLargestSalary(salaries));
    }

    @Test
    void testFindSecondLargestSalary_WithNegativeNumbers() {
        Integer[] salaries = {-500, -400, -300, -200, -100};
        assertEquals(-200, SecondHighestSalary.findSecondLargestSalary(salaries));
    }

    @Test
    void testFindSecondLargestSalary_WithSingleElement() {
        Integer[] salaries = {500};
        assertThrows(IllegalArgumentException.class, () -> SecondHighestSalary.findSecondLargestSalary(salaries));
    }

    @Test
    void testFindSecondLargestSalary_WithNullArray() {
        Integer[] salaries = null;
        assertThrows(IllegalArgumentException.class, () -> SecondHighestSalary.findSecondLargestSalary(salaries));
    }
}
