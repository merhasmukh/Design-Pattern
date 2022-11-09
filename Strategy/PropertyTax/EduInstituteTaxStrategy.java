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
public class EduInstituteTaxStrategy implements IPropertyTaxStrategy{

    double edurate,edutax;
    @Override
    public double CalculatePropertyTax(double income) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Education Institute applyable rate:");
        edurate = sc.nextDouble();
        System.out.println("Education Institute Tax is :");
        return edutax = (edurate * income) / 100;
    }
    
}
