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
public class MainClass {
    
 
    
    public static void main(String[] args) {
        
        
        MsgInterface mymsg = new Message();
        System.out.println(mymsg.MsgStyle());
        
        System.out.println("After Decorate...");
        
       
        MsgInterface yourmsg = new UpperCase(new ReverseOrder(new UpperCase(new Message())));
          System.out.println(yourmsg.MsgStyle());
        
        
        
     
        
        
    }
    

}
