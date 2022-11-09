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
public class Client {
    
    public static void main(String[] args) {
        
        PropertyContrext px = new PropertyContrext(new GuestHouse());
        
        System.out.println(px.getProperty());
    }
    
}
