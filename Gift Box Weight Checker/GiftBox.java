
import java.util.ArrayList;


public class GiftBox {
    private ArrayList<Biscuits> biscuitsSet;
    private ArrayList<Chocolate> chocolateSet;
    private double weight;

    public GiftBox(double[] biscuitsWeights, double[] chocolateWeight,
        String[] chocolateFlavors) {
            biscuitsSet = new ArrayList<Biscuits>();
            chocolateSet = new ArrayList<Chocolate>();

            for(int i =0;i<biscuitsWeights.length;i++){
                Biscuits pack = new Biscuits(biscuitsWeights[i]);
                biscuitsSet.add(pack);
                weight += pack.getWeight();
            }
            for(int i =0;i<biscuitsWeights.length;i++){
                Chocolate pack = new Chocolate(chocolateWeight[i],
                chocolateFlavor[i]);
                chocolateSet.add(pack);
                weight += pack.getWeight();
            }
 
        }

    public int getNumBiscuits() {
        return biscuitsSet.size();
    }

        public int getNumChocolate() {
            return chocolateSet.size();
    }

    public double getWeight(){
        return weight;
    }

    public void showBiscuitsWeights() {
        for(Biscuits biscuit : biscuitsSet) {
            System.out.println(biscuit.getWeight() + " ");
        }
    }

    public void showChocolateWeights() {
        for(Chocolate chocolate : chocolateSet) {
            System.out.println(chocolate.getWeight() + " ");
        }
    }
    public void showChocolateFlavors(){
        for(Chocolate chocolate : chocolateSet) {
            System.out.println(chocolate.getFlavor() + " ");
        }
    }
}
