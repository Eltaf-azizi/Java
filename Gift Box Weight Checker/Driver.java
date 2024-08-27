
import java.util.ArrayList;


public class Driver {

    public static void main(String[] args) {

        ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();
        double [] biscuitsWeight1 = {200.0, 100.0};// 2 biscuit sets
        double [] chocolateWeight1 = {200.0, 100.0};// 2 chocolate sets
        String [] chocolateFlavor1 = {"mint", "orange"};
        boxes.add(new GiftBox(biscuitsWeight1, chocolateWeight1, 
            chocolateFlavor1));

        double [] biscuitsWeight2 = {200.0, 300.0, 100.0};// 2 biscuit sets
        double [] chocolateWeight2 = {200.0, 100.0, 300.0};// 2 chocolate sets
        String [] chocolateFlavor2 = {"milk", "vanilla", "coffee"};
        boxes.add(new GiftBox(biscuitsWeight2, chocolateWeight2, 
            chocolateFlavor2));

            for(GiftBox box : boxes) {
                if(box.getWeight() > 1000.0) {
                    System.out.println("The box with " + box.getNumChocolate()
                    + " chocolate is overweight");

                    System.out.println("The biscuit weights are: ");
                    box.showBiscuitsWeights();

                    System.out.println("The chocolate weights are: ");
                    box.showChocolateWeights();

                    System.out.println("The flavors weights are: ");
                    box.showChocolateFlavors();
                    System.out.println();
                }
            }
    }
}
