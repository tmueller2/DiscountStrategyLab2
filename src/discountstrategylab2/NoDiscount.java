/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public double getDiscount(int qty, double price) {
        return 0;
    }
    
}
