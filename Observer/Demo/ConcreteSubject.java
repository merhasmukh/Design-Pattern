/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YouTube;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hasmukh
 */
public class ConcreteSubject implements Subject {
    
    public List<Subscriber> subs= new ArrayList<>();

    @Override
    public void subsCribe(Subscriber sub) {
        subs.add(sub);
        
    }

    @Override
    public void unSubscribe(Subscriber sub) {
       subs.remove(sub);
    }

    @Override
    public void notifySubs() {
        for(Observer sub : subs){
            sub.update();
        
        }
    }
    
    
    
}
