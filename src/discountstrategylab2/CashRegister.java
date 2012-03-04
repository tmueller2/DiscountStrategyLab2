/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class CashRegister {
    private Receipt receipt;
    
    public void startNewSale(int customerID){
        receipt = new Receipt(customerID);
    }
    
    public void addNewLineItem(String productID, int quanity){
        receipt.addNewLineItem(productID,quanity);
    }
    
//    public void showReceipt(){
//        System.out.println(receipt.getReceipt());
//    }

    void showReceipt() {
        System.out.println(receipt.getReceipt());
    }
}
