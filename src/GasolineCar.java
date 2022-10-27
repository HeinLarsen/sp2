public class GasolineCar extends AFuelCar {

    GasolineCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
    }

    public String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {
        int km = getKmPrLitre();
        if (km > 20 && km < 50) {
            return 330;
        } else if (km > 15 && km < 20) {
            return 1050;
        } else if (km > 10 && km < 15) {
            return 2340;
        } else if (km > 5 && km < 10) {
            return 5500;
        } else if (km < 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Type: Gasoline, " + super.toString();
    }
}
