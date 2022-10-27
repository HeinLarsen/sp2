public class ElectricCar extends ACar {
    private int batteryCapacityKWh;
    private int maxRangeKm;

    ElectricCar(int batteryCapacityKWh, int maxRangeKm, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {
        return maxRangeKm/batteryCapacityKWh;
    }

    public int getRegistrationFee() {
        int conversion = (int) ((getWhPrKm()/91.25)/100);
        if (conversion > 20 && conversion < 50) {
            return 330;
        } else if (conversion > 15 && conversion < 20) {
            return 1050;
        } else if (conversion > 10 && conversion < 15) {
            return 2340;
        } else if (conversion > 5 && conversion < 10) {
            return 5500;
        } else if (conversion < 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Type: Electric, " + super.toString() + ", Wh Pr km: " + getWhPrKm() + ", battery capacity kWh: " + batteryCapacityKWh + ", max range km: " + maxRangeKm;
    }
}
