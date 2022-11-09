/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameRepository;

import static NameRepository.Namerepository.name;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hasmukh
 */
public class MobNumberRepo implements IteratorInterface{
    
     static List<String> mob;
  static{
            
    mob = new ArrayList<String>();
  mob.add("9724458695");
    mob.add("8975684652");
     mob.add("8954656958");
     
  }
    int index=0;
   
  
    
     @Override
    public boolean hasNext() {
       if(index<mob.size())
       {
           return true;
       }
       return false;
    }

   
    @Override
    public Object Next() {
       if(index <= mob.size() )
       {
           return mob.get(index++);
       }
       return null;
    }

    
}
