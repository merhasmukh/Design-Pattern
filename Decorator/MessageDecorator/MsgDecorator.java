/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageDecorator;

/**
 *
 * @author Hasmukh
 */
public abstract class MsgDecorator implements MsgInterface{
    
    protected MsgInterface MsgSpecial;
    
    public MsgDecorator(MsgInterface MsgSpecial)
    {
        this.MsgSpecial=MsgSpecial;
    }
    
    
    
    
    
    
    
}
