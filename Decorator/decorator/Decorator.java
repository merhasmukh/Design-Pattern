/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Hasmukh
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         IceCream myicecream = new Vanilla();
        System.out.println(myicecream.Ice_Description());
        IceCream youricecream = new Peanuts(new Vanilla());
        System.out.println(youricecream.Ice_Description());
            
            
            
                           
    }
    
}
