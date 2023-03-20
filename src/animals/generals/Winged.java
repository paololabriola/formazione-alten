package animals.generals;

public abstract class Winged extends Animal {

    //Class attributes
    private double wingSpan;

    //Constructor method of the class
    public Winged(String nameOfTheSpecimen, String favouriteFood, int ageOfTheSpecimen, double weightOfTheSpecimen, double heightOfTheSpecimen, double wingSpan) {

        super(nameOfTheSpecimen, favouriteFood, ageOfTheSpecimen, weightOfTheSpecimen, heightOfTheSpecimen);
        this.wingSpan = wingSpan;

    }

    //Class methods getter and setter
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

}
