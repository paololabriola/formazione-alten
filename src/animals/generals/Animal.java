package animals.generals;

import java.time.LocalDate;

public abstract class Animal {

    //Class attributes
    private String nameOfTheSpecimen;

    private String favouriteFood;

    private int ageOfTheSpecimen;

    private LocalDate importDate;

    private double weightOfTheSpecimen;

    private double heightOfTheSpecimen;

    //Constructor method of the class
    public Animal(String nameOfTheSpecimen, String favouriteFood, int ageOfTheSpecimen, double weightOfTheSpecimen, double heightOfTheSpecimen) {

        this.nameOfTheSpecimen = nameOfTheSpecimen;
        this.favouriteFood = favouriteFood;
        this.ageOfTheSpecimen = ageOfTheSpecimen;
        this.importDate = LocalDate.now();
        this.weightOfTheSpecimen = weightOfTheSpecimen;
        this.heightOfTheSpecimen = heightOfTheSpecimen;

    }

    //Class methods getter and setter
    public String getNameOfTheSpecimen() {
        return nameOfTheSpecimen;
    }

    public void setNameOfTheSpecimen(String nameOfTheSpecimen) {
        this.nameOfTheSpecimen = nameOfTheSpecimen;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public int getAgeOfTheSpecimen() {
        return ageOfTheSpecimen;
    }

    public void setAgeOfTheSpecimen(int ageOfTheSpecimen) {
        this.ageOfTheSpecimen = ageOfTheSpecimen;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    public double getWeightOfTheSpecimen() {
        return weightOfTheSpecimen;
    }

    public void setWeightOfTheSpecimen(double weightOfTheSpecimen) {
        this.weightOfTheSpecimen = weightOfTheSpecimen;
    }

    public double getHeightOfTheSpecimen() {
        return heightOfTheSpecimen;
    }

    public void setHeightOfTheSpecimen(double heightOfTheSpecimen) {
        this.heightOfTheSpecimen = heightOfTheSpecimen;
    }

}
