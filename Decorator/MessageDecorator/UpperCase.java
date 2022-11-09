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
public class UpperCase extends MsgDecorator {
    

    public UpperCase(MsgInterface MsgSpecial) {
        super(MsgSpecial);
    }

   
    public String MsgStyle() {
        String ustr = MsgSpecial.MsgStyle();
        return ustr.toUpperCase();
    }

   

  
   

    
}
