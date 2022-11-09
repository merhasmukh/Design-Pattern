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
public class CommercialPropertyTaxStrategy implements IPropertyTaxStrategy{

    double comtax,gst;
    @Override
    public double CalculatePropertyTax(double income) {
       
         System.out.println("GST is 28% in our Country");
         comtax = (income * gst)/100;
         System.out.println("Your Commercial Property  Tax is :");
         return comtax;
    }
    
}
