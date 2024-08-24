public class CommercialDriver extends GenericDriver{
    private String hazardousMaterialsType;
    private String carType; //specific commercial car category

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
