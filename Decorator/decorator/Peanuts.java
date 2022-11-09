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
public class Peanuts extends specialClass {

    public Peanuts(IceCream SIceCream) {
        super(SIceCream);
    }

    @Override
    public String Ice_Description() {
       
          return SIceCream.Ice_Description() + " With Peanuts";
    }
    
}
