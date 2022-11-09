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
public interface Subject {
    
    public void subsCribe(Subscriber sub);
    public void unSubscribe(Subscriber sub);
    public void notifySubs();
    
}
