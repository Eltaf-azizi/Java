public class averageStockPrice {
    
    public static void main(String[] args) {

        Stock abcCompany = new Stock();
        
        abcCompany.buy(37.4, 2000);
        abcCompany.buy(39.7, 3000);
        abcCompany.sell(42.9, 1000);
        System.out.println(abcCompany.getShare());
        System.out.println(abcCompany.getPrice());
        System.out.println(abcCompany.getAveragePrice());
    }
}
