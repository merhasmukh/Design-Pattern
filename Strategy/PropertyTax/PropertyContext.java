



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
public class PropertyContext {
    
    public IPropertyTaxStrategy getStrategy;
    
     PropertyContext() {
         
    }
    public PropertyContext(IPropertyTaxStrategy strategy){
        
        this.getStrategy = strategy;
    
    
    }
    
    public double CalculatePropertyTax(double income){
        return getStrategy.CalculatePropertyTax(income);
    
    }

   
    


}