package animals.utils;

import animals.generals.Animal;
import animals.generals.Tailed;
import animals.generals.Winged;

import java.util.Comparator;
import java.util.List;

public class sortUtils {
    //Sorting method by the height of the specimens.
    public static List<Animal> sortByHeight(List<Animal> animals) {

        //Defining a comparator of a specific property of class Animal to customize the sorting method of our list for this specific case.
        Comparator<Animal> sortByHeight = Comparator.comparing(Animal::getHeightOfTheSpecimen);
        //Applying our new comparator as a parameter to sort our animals list taken as input.
        animals.sort(sortByHeight);
        //In the end this method returns the same list taken as input after being sorted.
        return animals;

    }

    //Sorting method by the weight of the specimens.
    public static List<Animal> sortByWeight(List<Animal> animals) {

        //Defining a comparator of a specific property of class Animal to customize the sorting method of our list for this specific case.
        Comparator<Animal> sortByWeight = Comparator.comparing(Animal::getWeightOfTheSpecimen);
        //Applying our new comparator as a parameter to sort our animals list taken as input.
        animals.sort(sortByWeight);
        //In the end this method returns the same list taken as input after being sorted.
        return animals;

    }

    //Sorting method by the tail length of the specimens.
    public static List<Tailed> sortByTailLength(List<Tailed> animals) {

        //Defining a comparator of a specific property of class Tailed that extends Animal to customize the sorting method of our list for this specific case.
        Comparator<Tailed> sortByTailLength = Comparator.comparing(Tailed::getTailLength);
        //Applying our new comparator as a parameter to sort our animals list taken as input.
        animals.sort(sortByTailLength);
        //In the end this method returns the same list taken as input after being sorted.
        return animals;

    }

    //Sorting method by the wingspan of the specimens.
    public static List<Winged> sortByWingSpan(List<Winged> animals) {

        //Defining a comparator of a specific property of class Winged that extends Animal to customize the sorting method of our list for this specific case.
        Comparator<Winged> sortByWingSpan = Comparator.comparing(Winged::getWingSpan);
        //Applying our new comparator as a parameter to sort our animals list taken as input.
        animals.sort(sortByWingSpan);
        //In the end this method returns the same list taken as input after being sorted.
        return animals;

    }

}
