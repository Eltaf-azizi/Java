/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Stock {

    private int shares;
    private double price;
    private double capital;

    public void buy(double p, int s) {

        shares += s;
        price = p;
        capital += p * s;

    }
    public void sell(double p, int s){

        shares -= s;
        price = p;
        capital -= p * s;
    }
    public int getShare() {
        return shares;
    }

    public double getPrice(){
        return price;
    }

    public double getAveragePrice() {
        return capital / getShares();
    }
}
