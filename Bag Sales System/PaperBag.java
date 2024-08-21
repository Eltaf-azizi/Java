
public class PaperBag extends Bag {
    public double getPrice(){
        //lenght and width are private to Bag class
        // need getter methods to obtain them
        double area = getLength() * getWidth();

        if(area > 300.0) {price = 0.2;}
        else{price = 0.14;}
        return price;
    }
}
