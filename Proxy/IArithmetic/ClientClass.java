/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IArithmetic;

/**
 *
 * @author Hasmukh
 */
public class ClientClass {
    
    public static void main(String[] args) {
        
        ProxyArithmatic p = new ProxyArithmatic();
        
       
        
        float ans ,i,j;
        i=12;
        j=23;
                ans = p.doIt(i,j);
        
        System.out.println("Ans Is :" + ans);
        
    }
    
}
