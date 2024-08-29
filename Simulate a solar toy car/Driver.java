
public class Driver {
    public static void main(String[] args) {
        SolarToyCar myCar = new SolarToyCar();
        System.out.println(myCar.getBattery());
        myCar.turn(Direction.RIGHT, 44);
        System.out.println(myCar.getBattery());
        myCar.forward(30.0);
        System.out.println(myCar.getBattery());
        myCar.turnWithSolarEnergy(20.0);
        System.out.println(myCar.getBattery());
        myCar.moveWithSolarEnergy(100.0);
        System.out.println(myCar.getBattery());
        myCar.chargeBattery();
        System.out.println(myCar.getBattery());
    }
}
