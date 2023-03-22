package animals;

import animals.model.abstractation.Animal;
import animals.model.abstractation.Tailed;
import animals.model.abstractation.Winged;
import animals.model.implementation.Eagle;
import animals.model.implementation.Lion;
import animals.model.implementation.Tiger;
import animals.utils.SearchUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lion lion1 = new Lion("Alex", "Zebra", 8, 190.0, 2.50, 0.70);
        Lion lion2 = new Lion("Aslan", "Gazelle", 12, 180.0, 3.10, 0.81);
        Lion lion3 = new Lion("Nemeo", "Human", 7, 170.0, 2.30, 0.65);

        Tiger tiger1 = new Tiger("Tigro", "Miele", 12, 160.0, 2.10, 0.90);

        Eagle eagle1 = new Eagle("Valor", "Summoner", 3, 0.30, 0.84, 1.92);
        Eagle eagle2 = new Eagle("Gwaihir", "Orc", 6961,1,5.18, 24.6);

        List<Animal> lionsList = new ArrayList<>();
        lionsList.add(lion1);
        lionsList.add(lion2);
        lionsList.add(lion3);

        List<Tailed> tailedAnimalList = new ArrayList<>();
        tailedAnimalList.add(lion1);
        tailedAnimalList.add(lion2);
        tailedAnimalList.add(lion3);
        tailedAnimalList.add(tiger1);

        List<Winged> wingedAnimalList = new ArrayList<>();
        wingedAnimalList.add(eagle1);
        wingedAnimalList.add(eagle2);

        List<Animal> tallestShortest = new ArrayList<>();
        tallestShortest.addAll(SearchUtils.getTallestAndShortest(lionsList));

        System.out.println("The shortest animal of this list is: " + tallestShortest.get(0).getNameOfTheSpecimen() + " with its " + tallestShortest.get(0).getHeightOfTheSpecimen() + "m.");
        System.out.println("The tallest animal of this list is: " + tallestShortest.get(1).getNameOfTheSpecimen()+ " with its " + tallestShortest.get(1).getHeightOfTheSpecimen() + "m.");


        List<Animal> heaviestLightest = new ArrayList<>();
        heaviestLightest.addAll(SearchUtils.getHeaviestAndLightest(lionsList));

        System.out.println("The lightest animal of this list is: " + heaviestLightest.get(0).getNameOfTheSpecimen() + " with its " + heaviestLightest.get(0).getWeightOfTheSpecimen() + "kg.");
        System.out.println("The heaviest animal of this list is: " + heaviestLightest.get(1).getNameOfTheSpecimen()+ " with its " + heaviestLightest.get(1).getWeightOfTheSpecimen() + "kg.");


        System.out.println("The tailed animal with the longest tail is: " + SearchUtils.getLongestTailElement(tailedAnimalList).getNameOfTheSpecimen() + " with its " + SearchUtils.getLongestTailElement(tailedAnimalList).getTailLength() + "m.");

        System.out.println("The winged animal with the biggest wingspan is: " + SearchUtils.getBiggestWingSpanElement(wingedAnimalList).getNameOfTheSpecimen() + " with its " + SearchUtils.getBiggestWingSpanElement(wingedAnimalList).getWingSpan() + "m.");

    }

}
