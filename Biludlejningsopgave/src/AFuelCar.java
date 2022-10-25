public abstract class AFuelCar extends ACar {
    int kmPrLitre;

    AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    int kmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + ", km Pr litre: " + kmPrLitre;

    }
}
