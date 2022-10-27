public class DieselCar extends AFuelCar {

    private boolean particleFilter;

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
        int km = getKmPrLitre();
        int fee = 0;
        if (km > 20 && km < 50) {
            fee = 130;
        } else if (km > 15 && km < 20) {
            fee =  1390;
        } else if (km > 10 && km < 15) {
            fee =  1850;
        } else if (km > 5 && km < 10) {
            fee =  2770;
        } else if (km < 5) {
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
