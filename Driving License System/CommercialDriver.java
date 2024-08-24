public class CommercialDriver extends GenericDriver{
    private String hazardousMaterialsType;
    private String carType; //specific commercial car category

    public void commercialDriver(String name, boolean isProvisional,
    String materialType, String car){
        super(name, isProvisional);
    }
}
