/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class LineItem {
    private Product product;
    private int quanity;
    
    //setting product information and quanity discount associated with the
    //product using an array
    private Product[] productData = {new Product(new NoDiscount(), "S632", "Mitsubishi Af2/3 Power Feeder", 110.00),
        new Product(new QuanityDiscount(), "A058", "Mitsubishi .008 Upper Diamond Guide", 389.00),
        new Product(new ChristmasDiscount(), "C101", "Charmilles .010 Upper/Lower Diamond Guide", 220.25)};

    //constructor
    public LineItem(String productID, int quanity){
        this.quanity = quanity;
        product = findProductByID(productID);
    }
    
    private Product findProductByID(String productID){
        Product product = null;
        for (Product p : productData){
            if(productID.equals(p.getProductID())){
                product = p;
                break;
            }
        }
        return product;
    }
    
    public String getLineItmeData(){
        return (product.getProductID() + "   " + product.getDescription());
    }
    
    public double detDiscountAmt(){
        return(product.getDiscountAmount(quanity));
    }
    
    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quanity
     */
    public int getQuanity() {
        return quanity;
    }

    /**
     * @param quanity the quanity to set
     */
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    
    
    
}
