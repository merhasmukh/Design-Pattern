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
public class LiquidState implements IWater{

    @Override
    public void ChangeState(WaterContext wc) {
        System.out.println("Water Changed into Liqued..!!");
    }
    
}
