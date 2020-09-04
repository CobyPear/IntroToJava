package LabForLoops;

public class ReverseOrder {

    public static void main(String[] args) {

        String[] cities = { "Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia",
                "Seattle" };
        // reverse the order of the cities array
        int currentIndex = 0;
        int lastIndex = cities.length - 1;
        String[] reversedCities = new String[cities.length];

        while (currentIndex < cities.length) {
            reversedCities[currentIndex] = cities[lastIndex];
            currentIndex++;
            lastIndex--;
        }

        cities = reversedCities;

        // print the result
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
            // System.out.println(reversedCities[i]);
        }

        // Provided Answer Below ------------------------------------------------------

        /*
        String[] cities = { "Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia",
                "Seattle" };

        // reverse the order of the array below
        for (int i = 0; i < cities.length / 2; i++) {
            // store temporary value String
            city = cities[i];
            // swap the elements from front to back
            cities[i] = cities[cities.length - 1 - i];
            cities[cities.length - 1 - i] = city;
        }

        // print the result
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        */

    }
}
