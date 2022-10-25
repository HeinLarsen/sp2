public class DieselCar extends AFuelCar {
    boolean particleFilter;

    DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        if (kmPrLitre > 20 && kmPrLitre < 50) {
            fee = 130;
        } else if (kmPrLitre > 15 && kmPrLitre < 20) {
            fee =  1390;
        } else if (kmPrLitre > 10 && kmPrLitre < 15) {
            fee =  1850;
        } else if (kmPrLitre > 5 && kmPrLitre < 10) {
            fee =  2770;
        } else if (kmPrLitre < 5) {
            fee =  15260;
        }
        if (!particleFilter) {
            fee += 1000;
        }

        return fee;
    }

    @Override
    public String toString() {
        return "Type: Diesel, " + super.toString() + ", particle filter: " + particleFilter;
    }
}
