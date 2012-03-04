/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class Receipt {
    
    private Customer customer;
    private LineItem [] lineItems;
    private double saleTotal;
    private double subTotal;
    
    //customer data
    private Customer [] customerArray ={
        new Customer(1, "John", "Doe"),
        new Customer(2,"James", "Lombardo"),
        new Customer(3,"Todd", "Mueller")};
    
    public Receipt(int customerID){
        lineItems = new LineItem[0];
        customer = findCustomerByID(customerID);
    }
    
    private Customer findCustomerByID(int customerID){
        Customer customer = null;
        for(Customer c: customerArray){
            if (customerID == c.getCustID()){
            //if (customerID.equals(c.getCustID())){
                customer = c;
                break;
            }
        }
        return customer;
    }
    
    public void addNewLineItem(String productID, int quanity){
        //LineItem lineItem = new LineItem(productID, qty);
        
        //resize array step 1: make a temp array that is on larger than 
        //the original
        LineItem [] temp = new LineItem[lineItems.length + 1];
        
        //resize array step 2: use built in arraycopy function
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        
        //resize array step 3: add the new item to the end of the temp array
        temp[temp.length - 1] = new LineItem(productID,quanity);
        
        //resize array step 4: set the original variable to the new 
        //larger array
        lineItems = temp;
    }

    /**
     * @return the saleTotal
     */
    public double getSaleTotal() {
        for (int i=0; i<lineItems.length; i++){
            //Code below not used to minimize dependencies
            //saleTotal = (lineItems[i].getProduct().getUnitCost())*(lineItems[i].getProduct().getUnitCost());
            saleTotal += (lineItems[i].getProductAmt());
        }
        
        return saleTotal;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        for(int i=0; i<lineItems.length; i++){
            subTotal += (lineItems[i].getDiscountAmt());
        }
        
        return subTotal;
    }
    
    public String getReceipt(){
        String str;
        //str = customer.getCustID();
        str = customer.getCustFirstName() + " " + customer.getCustLastName() +"\n\n";
        str += "DESCRIPTION \t\t\t\t\t\t" + "QUANITY\t\t" + "COST\t\t" + "DISCOUNT\n";
        for (int i=0; i<lineItems.length; i++){
            str += lineItems[i].getLineItemData() + "\t " + lineItems[i].getQuanity();
            str += "\t\t$" + lineItems[i].getProductAmt() + "\t\t";
            str += "$" + lineItems[i].getDiscountAmt();
            str += "\n";
        }
        
        for(int i=0; i<lineItems.length; i++){
            subTotal += (lineItems[i].getDiscountAmt());
        }
        str += "\n\t\t\t\t\t\t\t" + "SUB TOTAL: $" + subTotal;
        
        for (int i=0; i<lineItems.length; i++){
            //Code below not used to minimize dependencies
            //saleTotal = (lineItems[i].getProduct().getUnitCost())*(lineItems[i].getProduct().getUnitCost());
            saleTotal += (lineItems[i].getProductAmt());
        }
        str += "\n\t\t\t\t\t\t\t" + "    TOTAL: $" + saleTotal;
        
        return(str);
    }
    
}
    

