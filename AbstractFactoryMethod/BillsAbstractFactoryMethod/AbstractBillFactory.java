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
public abstract class AbstractBillFactory {

   

   
    
   public abstract ElectricityBillInterface  getElectricityBill( );
   public abstract WaterBillInterface  getWaterBill( );
   public static AbstractBillFactory getFactory(int i)
    {
       switch (i) {
           case 1:
               return new RajkotBillFactory();
           case 2:
               return new AhmdBillFactory();
           default:
               return null;
       }    
    }
    
}
