package animals.utils;

import animals.model.abstractation.Animal;
import animals.model.abstractation.Tailed;
import animals.model.abstractation.Winged;

import java.util.ArrayList;
import java.util.List;

public class SearchUtils {

    public static List<Animal> getTallestAndShortest(List<Animal> animals){

        List<Animal> tallestAndShortest = new ArrayList<>();
        SortUtils.sortByHeight(animals);

        //After sorting the list we are going to assign the first and last element to the tallestAndShortest list in order to save the tallest and the shortest elements.

        //Shortest (first element of the list, which is in position 0)
        tallestAndShortest.add(animals.get(0));
        //Tallest (max size of the list minus 1, cus its position counter starts from 0)
        tallestAndShortest.add(animals.get(animals.size() - 1));

        return tallestAndShortest;

    }

    public static List<Animal> getHeaviestAndLightest(List<Animal> animals){

        List<Animal> heaviestAndLightest = new ArrayList<>();
        SortUtils.sortByWeight(animals);

        //After sorting the list we are going to assign the first and last element to the heaviestAndLightest list in order to save the heaviest and the lightest elements.

        //Lightest (first element of the list, which is in position 0)
        heaviestAndLightest.add(animals.get(0));
        //Heaviest (max size of the list minus 1, cus its position counter starts from 0)
        heaviestAndLightest.add(animals.get(animals.size() - 1));

        return heaviestAndLightest;

    }

    public static Tailed getLongestTailElement(List<Tailed> animals){

        Tailed longestTailElement = SortUtils.sortByTailLength(animals).get(animals.size() - 1);

        return longestTailElement;

    }

    public static Winged getBiggestWingSpanElement(List<Winged> animals){

        Winged biggestWingSpanElement = SortUtils.sortByWingSpan(animals).get(animals.size() - 1);

        return biggestWingSpanElement;

    }

}
