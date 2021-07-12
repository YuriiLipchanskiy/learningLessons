package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("sdlaldk");
        animals.add("Dog");
        animals.add("Frog");
        animals.add("Cat");
        animals.add("sd");
        animals.add("Bird");
        animals.add("d");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1000);
        numbers.add(0);
        numbers.add(54);
        numbers.add(101);

        Collections.sort(numbers);
        System.out.println(numbers);
    }

}
