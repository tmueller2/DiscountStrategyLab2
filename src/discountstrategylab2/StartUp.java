/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab2;

/**
 *
 * @author Spark
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startNewSale(1);
        cr.addNewLineItem("S632", 6);
        cr.addNewLineItem("A058", 2);
        cr.addNewLineItem("C101", 1);
        cr.showReceipt();
    }
}
