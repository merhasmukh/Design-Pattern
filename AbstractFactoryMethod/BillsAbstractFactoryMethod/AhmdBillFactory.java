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
public class AhmdBillFactory extends AbstractBillFactory {

    @Override
    public ElectricityBillInterface getElectricityBill() {
       return new AhmdEBill();
    }

    @Override
    public WaterBillInterface getWaterBill() {
       return new AhmdWBill();
    }
    
}
