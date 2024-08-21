
public class PlasticBag extends Bag {
    //instance vairable specific to PlasticBag
    private double tax;
    public void setTax(double tax) {
        this.tax = tax;
    }

    private double getTax(){
        return tax;
    }

    public double getPrice(){
        double area = getLength() * getWidth();
        if(area > 344){price = 0.3;}
        else{price = 0.2;}
        return price + tax;
    }
}
