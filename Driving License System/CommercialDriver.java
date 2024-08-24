public class CommercialDriver extends GenericDriver{
    private String hazardousMaterialsType;
    private String carType; //specific commercial car category

    public CommercialDriver(String string, boolean b, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }

    public void commercialDriver(String name, boolean isProvisional,
    String materialType, String car){
        super(name, isProvisional);
        hazardousMaterialsType = materialType;
        carType = car;
    }

    public String getMaterialsType() {
        return hazardousMaterialsType;
    }

    // override genericDriver's method

    public void setMedicalReport() {
        medicalReport = "Approved to drive " + carType;
    }
}
