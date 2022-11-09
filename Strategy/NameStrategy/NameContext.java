/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameStrategy;

/**
 *
 * @author Hasmukh
 */
public class NameContext {
    
    public NameChange name;
    
    
    public NameContext(){
    
    }
    
    public NameContext(NameChange name){
        this.name = name;
    }
    
    public String  getBName(){
        
        return name.getName();
    
    
    }
    
}
