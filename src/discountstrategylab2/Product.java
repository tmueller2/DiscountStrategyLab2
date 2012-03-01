/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class Product {
    private DiscountStrategy discountStrategy;
    private String productID;
    private String description;
    private double unitCost;

    //constructor
    public Product (DiscountStrategy discountStrategy, String productID, String description, double unitCost){
        this.discountStrategy = discountStrategy;
        this.productID = productID;
        this.description = description;
        this.unitCost = unitCost;
    }
    
    /**
     * @return the discountStrategy
     */
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * @param discountStrategy the discountStrategy to set
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    public double getDiscountAmount(int qty){
        return (discountStrategy.getDiscount(qty, unitCost));
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the unitCost
     */
    public double getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    
}
