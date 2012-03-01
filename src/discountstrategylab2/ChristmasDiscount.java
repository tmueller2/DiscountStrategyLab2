/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class ChristmasDiscount implements DiscountStrategy {
    private double price;
    
    //amount of discount for Christmas
    private static double christmasDisc = .30;

    
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount(int qty, double price) {
        return ((price * christmasDisc)* qty);
    }
    
    
    
}
