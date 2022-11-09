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
public class MainClient {
    
    public static void main(String[] args) {
        double amount;
        Scanner sc =new Scanner(System.in);
        
        
        
        System.out.println("Enter Your Income : ");
        amount = sc.nextDouble();
        PropertyContext edu = new PropertyContext(new EduInstituteTaxStrategy());
        
       System.out.println( edu.getStrategy.CalculatePropertyTax(amount));
       
        PropertyContext hostax = new PropertyContext(new HospitalPropertyTaxStrategy());
        
       System.out.println( hostax.getStrategy.CalculatePropertyTax(amount));
       
}
}