
import java.lang.classfile.instruction.LocalVariableType;


public class DriverProgram {
    public static void main(String[] args) {
        GenericDriver  tom = new GenericDriver("Tom", true);
        tom.deduct(3);
        tom.setMedicalReport();
        CommercialDriver lily = new CommercialDriver("Lily", false,
        "inflammable", "truck");

        lily.deduct(4);
        lily.setMedicalReport();

        GenericDriver [] driverArray = new GenericDriver[2];
        driverArray[0] = tom;
        driverArray[1] = lily;

        for(int i = 0; i<driverArray.length; i++) {
            System.out.println(driverArray[i].getName() + "'s license is provisional" +
             driverArray[i].getIsProvisional());
             System.out.println(driverArray[i].getName() + " has " + driverArray[i].getPoints());
             System.out.println(driverArray[i].getMedicalReport());
        }

        // run a method specific to subclass only
        System.out.println(Lily.getMaterialsType());
    }
}
