/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PropertyTax;

/**
 *
 * @author Hasmukh
 */
import java.util.Scanner;
public class ResPropertyTaxStrategy implements  IPropertyTaxStrategy{

        double MunTaxRate,MunTax;
    @Override
    public double CalculatePropertyTax(double income) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter Municipal Tax Rate:");
        MunTaxRate = sc.nextDouble();
        MunTax = income*(MunTaxRate/100);
        return MunTax;
    }
    
}
