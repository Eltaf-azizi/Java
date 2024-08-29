
public class SolarToyCar extends ToyCar implements SolarPanel{
    // method overriding occurs here

    public void chargeBattery() {
        System.out.println("Charge battery with " + numPanels + " solar panels");
        this.batteryLevel = fullBattery;
    }

    public void moveWithSolarEnergy
}
