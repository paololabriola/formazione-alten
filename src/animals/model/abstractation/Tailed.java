package animals.model.abstractation;

public abstract class Tailed extends Animal {

    //Class attributes
    private double tailLength;

    //Constructor method of the class
    public Tailed(String nameOfTheSpecimen, String favouriteFood, int ageOfTheSpecimen, double weightOfTheSpecimen, double heightOfTheSpecimen, double tailLength) {

        super(nameOfTheSpecimen, favouriteFood, ageOfTheSpecimen, weightOfTheSpecimen, heightOfTheSpecimen);
        this.tailLength = tailLength;

    }

    //Class methods getter and setter
    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLenght) {
        this.tailLength = tailLenght;
    }

}
