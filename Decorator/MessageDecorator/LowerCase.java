

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
public class LowerCase  extends MsgDecorator{

    public LowerCase(MsgInterface MsgSpecial) {
        super(MsgSpecial);
    }

   public String MsgStyle() {
        String lstr = MsgSpecial.MsgStyle();
        return  lstr.toLowerCase();
    }
    
}
