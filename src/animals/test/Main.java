package animals.test;

import animals.generals.Animal;
import animals.generals.Tailed;
import animals.generals.Winged;
import animals.species.Eagle;
import animals.species.Lion;
import animals.species.Tiger;
import animals.utils.searchUtils;

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
        tallestShortest.addAll(searchUtils.getTallestAndShortest(lionsList));

        for(int i=0; i < 2; i++) {

            if(i == 0)
                System.out.println("The shortest animal of this list is: " + tallestShortest.get(i).getNameOfTheSpecimen() + " with its " + tallestShortest.get(i).getHeightOfTheSpecimen() + "m.");

            if(i == 1)
                System.out.println("The tallest animal of this list is: " + tallestShortest.get(i).getNameOfTheSpecimen()+ " with its " + tallestShortest.get(i).getHeightOfTheSpecimen() + "m.");

        }

        List<Animal> heaviestLightest = new ArrayList<>();
        heaviestLightest.addAll(searchUtils.getHeaviestAndLightest(lionsList));

        for(int i=0; i < 2; i++) {

            if(i == 0)
                System.out.println("The lightest animal of this list is: " + heaviestLightest.get(i).getNameOfTheSpecimen() + " with its " + heaviestLightest.get(i).getWeightOfTheSpecimen() + "kg.");

            if(i == 1)
                System.out.println("The heaviest animal of this list is: " + heaviestLightest.get(i).getNameOfTheSpecimen()+ " with its " + heaviestLightest.get(i).getWeightOfTheSpecimen() + "kg.");

        }

        System.out.println("The tailed animal with the longest tail is: " + searchUtils.getLongestTailElement(tailedAnimalList).getNameOfTheSpecimen() + " with its " + searchUtils.getLongestTailElement(tailedAnimalList).getTailLength() + "m.");

        System.out.println("The winged animal with the biggest wingspan is: " + searchUtils.getBiggestWingSpanElement(wingedAnimalList).getNameOfTheSpecimen() + " with its " + searchUtils.getBiggestWingSpanElement(wingedAnimalList).getWingSpan() + "m.");

    }

}
