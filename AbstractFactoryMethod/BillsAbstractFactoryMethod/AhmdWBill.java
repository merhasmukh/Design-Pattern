/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillsAbstractFactoryMethod;

/**
 *
 * @author Hasmukh
 */
public class AhmdWBill implements WaterBillInterface {

        double wbamt=60;
    @Override
    public double getWBillAmount() {
        return wbamt;
    }

    @Override
    public String getTermAndCond() {
      return "You Get Water Only One Hour Daily.... ";
    }
    
}
