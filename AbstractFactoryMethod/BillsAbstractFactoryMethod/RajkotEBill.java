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
public class RajkotEBill implements ElectricityBillInterface {

    double unit;
    
    @Override
    public double getEBillAmount() {
        return unit*1.25;
    }

    @Override
    public double getEBillUnits() {
        return unit;
    }

    @Override
    public void setEBillUnits(double unit) {
        
        this.unit=unit;
    }

}  