public class Main {
    public static void main(String[] args) {
        FleetOfCars f1 = new FleetOfCars();

        GasolineCar g1 = new GasolineCar(9, "wdw", "BMW", "3", 4);
        DieselCar d1 = new DieselCar(17, true, "dcw", "Fiat", "Panda", 2);
        DieselCar d2 = new DieselCar(17, false, "ghpw", "Peugot", "307", 4);
        ElectricCar e1 = new ElectricCar(100, 500, "noc8l", "Telsa", "3", 4);

        f1.addCar(g1);
        f1.addCar(d1);
        f1.addCar(d2);
        f1.addCar(e1);

        System.out.println(f1);
        int res = f1.getTotalRegistrationFeeForFleet();
        System.out.println("Total registration fee for your fleet: " + res);

    }
}