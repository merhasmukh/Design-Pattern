/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Second;

/**
 *
 * @author Hasmukh
 */
public class PropertyContrext {
    public PropertyInterface propertyname;
    
    public PropertyContrext (){}
    public PropertyContrext(PropertyInterface propertyname){
        
        this.propertyname = propertyname;
    
    
    }
    
    public String getProperty(){
    
            return propertyname.getProperty();
    
    }
    
}
