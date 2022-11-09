/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YouTube;

/**
 *
 * @author Hasmukh
 */
public class MainClient {
    
    public static void main(String[] args) {
        
       ConcreteSubject cs = new ConcreteSubject();
       Subscriber s1 = new Subscriber("hasmukh");
       Subscriber s2 = new Subscriber("amit");
     
       cs.subsCribe(s1);
     
       cs.subsCribe(s2);
      cs.unSubscribe(s2);
      cs.unSubscribe(s1);
          cs.subsCribe(s2);
    
     
       cs.notifySubs();
    }
    
}
