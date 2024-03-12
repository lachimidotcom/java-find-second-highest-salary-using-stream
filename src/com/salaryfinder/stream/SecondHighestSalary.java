package com.salaryfinder.stream;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SecondHighestSalary {

	public static void main(String[] args) {
		Integer[] salaries = { 500, 600, 700, 800, 900 };
		Integer secondLargest = findSecondLargestSalary(salaries);
		System.out.println("The second largest salary is: " + secondLargest);
	}

	public static Integer findSecondLargestSalary(Integer[] salaries) {
        if (salaries == null || salaries.length < 2) {
            throw new IllegalArgumentException("Input array should have at least two elements");
        }
        return Arrays.stream(salaries)
                .distinct()
                .sorted()
                .skip(salaries.length - 2)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
