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
 public class Iter implements IteratorInterface{
     String name [] = {"hasmukh","amit"};
     int index = 0;
        @Override
        public boolean hasNext() {
            
            if(index < name.length)
            {
            return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
             return name[index++];
            }
        return null;
        }
    
    
    
    }
