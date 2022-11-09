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
public class HospitalPropertyTaxStrategy implements IPropertyTaxStrategy{

        double hosprorate,hostax;
    @Override
    public double CalculatePropertyTax(double income) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hospital Tax Rate:");
        hosprorate = sc.nextDouble();
        System.out.println("Your Hospital Tax is: ");
        return hostax = (income * hosprorate) / 100;
    }
    
}
