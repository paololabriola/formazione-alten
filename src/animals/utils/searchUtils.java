package animals.utils;

import animals.generals.Animal;
import animals.generals.Tailed;
import animals.generals.Winged;

import java.util.ArrayList;
import java.util.List;

public class searchUtils {
    //Searching method for the tallest and the shortest elements of an animals' list.
    public static List<Animal> getTallestAndShortest(List<Animal> animals){

        //Declaring tallest and shortest animal list.
        List<Animal> tallestAndShortest = new ArrayList<>();
        //Applying the sorting method defined in the sortUtils class onto animals list taken as input.
        sortUtils.sortByHeight(animals);
        //After sorting the list we are going to assign the first and last element to the tallestAndShortest list in order to save the tallest and the shortest elements.
        //Shortest (first element of the list, which is in position 0)
        tallestAndShortest.add(animals.get(0));
        //Tallest (max size of the list minus 1, cus its position counter starts from 0)
        tallestAndShortest.add(animals.get(animals.size() - 1));
        //Then we return the list which contains only the tallest and the shortest elements.
        return tallestAndShortest;

    }

    //Searching method for the heaviest and the lightest elements of an animals' list.
    public static List<Animal> getHeaviestAndLightest(List<Animal> animals){

        //Declaring heaviest and lightest animal list.
        List<Animal> heaviestAndLightest = new ArrayList<>();
        //Applying the sorting method defined in the sortUtils class onto animals list taken as input.
        sortUtils.sortByWeight(animals);
        //After sorting the list we are going to assign the first and last element to the heaviestAndLightest list in order to save the heaviest and the lightest elements.
        //Lightest (first element of the list, which is in position 0)
        heaviestAndLightest.add(animals.get(0));
        //Heaviest (max size of the list minus 1, cus its position counter starts from 0)
        heaviestAndLightest.add(animals.get(animals.size() - 1));
        //Then we return the list which contains only the heaviest and the lightest elements.
        return heaviestAndLightest;

    }

    //Searching method for the longestTailed element of an animals' list.
    public static Tailed getLongestTailElement(List<Tailed> animals){

        Tailed longestTailElement = sortUtils.sortByTailLength(animals).get(animals.size() - 1);

        return longestTailElement;

    }

    public static Winged getBiggestWingSpanElement(List<Winged> animals){

        Winged biggestWingSpanElement = sortUtils.sortByWingSpan(animals).get(animals.size() - 1);

        return biggestWingSpanElement;

    }

}
