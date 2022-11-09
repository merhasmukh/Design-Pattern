/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Hasmukh
 */
public class Iter2 implements IteratorInterface {
 String name2 [] = {"hasmukh","amit","Kapil","Himanshu"};
 int index = 0;
    @Override
    public boolean hasNext() {
            
         if(index < name2.length)
            {
            return true;
            }
            return false;
    }

    @Override
    public Object next() {
            if(this.hasNext()){
             return name2[index++];
            }
        return null;        }
    
}
