
public class SolarToyCar extends ToyCar implements SolarPanel{
    // method overriding occurs here

    public void chargeBattery() {
        System.out.println("Charge battery with " + numPanels + " solar panels");
        this.batteryLevel = fullBattery;
    }

    public void moveWithSolarEnergy(double distance) {
        System.out.println("Move for " + distance + " meters without using battery power");
    }

    public void turnWithSolarEnergy(double angle) {
        System.out.println("Turn for " + angle + " degrees without using battery power");
    }
}
