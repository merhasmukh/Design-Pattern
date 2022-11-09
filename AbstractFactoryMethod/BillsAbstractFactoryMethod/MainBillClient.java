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
import java.util.*;
public class MainBillClient {
    
    public static void main(String[] args) {
        
        AbstractBillFactory abf;
        int choice;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("1.Rajkot ");
        System.out.println("2.Ahmedabad ");
       
        System.out.print("Select your City :- ");
        choice = sc.nextInt();
        
       abf = AbstractBillFactory.getFactory(choice);
       WaterBillInterface wb = abf.getWaterBill();
       ElectricityBillInterface eb = abf.getElectricityBill();
       eb.setEBillUnits(45);
       wb.getTermAndCond();
       
       System.out.println("Water Bill Amount : "+ wb.getWBillAmount());
        System.out.println("Terms And Conditions:"+ wb.getTermAndCond());
       System.out.println("Electricity Bill Units : " + eb.getEBillUnits());
       System.out.println("Electricity Bill Amount : "+ eb.getEBillAmount());
      
      
    }
}
