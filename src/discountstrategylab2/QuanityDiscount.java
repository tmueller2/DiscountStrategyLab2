/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class QuanityDiscount implements DiscountStrategy {
    
    private double price;

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
        
        //order 5 or more and get 25% discount
        if (qty >5){
            return ((price * .25)*qty);
        }
        else return (0);
    }
    
}
