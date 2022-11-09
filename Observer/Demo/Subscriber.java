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
public class Subscriber implements Observer{
    String name;
    Subscriber(String name) {
        this.name =name;
    }

    @Override
    public void update() {
       System.out.println(name + "  New Video Uploaded..!!");
    }
    
}
