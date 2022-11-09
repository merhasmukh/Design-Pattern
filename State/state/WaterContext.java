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
public class WaterContext {
    
    public IWater iw;
    
    public WaterContext(){
        iw=new LiquidState();
    }
    
    public void setState(IWater iws){
        this.iw=iws;
    }
   
    public void NewState(){
        iw.ChangeState(this);
    }
    
    
    
}
