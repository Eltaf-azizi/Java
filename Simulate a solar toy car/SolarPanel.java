
public interface SolarPanel {
    public static int numPanels = 2;

    public void chargeBattery();
    public void moveWithSolarEnergy(double distance);
    public void turnWithSolarEnergy(double angle);
}
