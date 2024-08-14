public class restaurantBillingSystem {
    public static void main(String[] args) {
        String[] dish = {"Sandwich", "Coffee", "Frech Fries", "Salad"};
        double[] cost = {4.3, 4.3, 3.7, 7.1};
        bill myBill = new bill();
        //pass copies of array references
        myBill.addOrder("Sandwich", 2, dish, cost);
        myBill.addOrder("French Fries", 1, dish, cost);
        myBill.addOrder("Salad", 2, dish, cost);
        myBill.getOrder();
        System.out.println(myBill.getTotal());
    } 
}
