/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Hasmukh
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WaterContext wc = new WaterContext();
        
        wc.NewState();
        wc.setState(new SolidState());
        
        wc.NewState();
         wc.setState(new LiquidState());
             wc.NewState();
    }
    
}
