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
import java.lang.*;
public class ReverseOrder extends MsgDecorator {

    public ReverseOrder(MsgInterface MsgSpecial) {
        super(MsgSpecial);
    }
    @Override
    public String MsgStyle() {
            String rstr = MsgSpecial.MsgStyle();
            StringBuilder sbfr = new StringBuilder(rstr);
            return  ""+sbfr.reverse();
        }
   
}
