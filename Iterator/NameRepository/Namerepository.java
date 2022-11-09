/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameRepository;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hasmukh
 */
public class Namerepository  implements IteratorInterface{
    
    static List<String> name;
  static{
            
    name = new ArrayList<String>();
   
      name.add("hasmukh");
    name.add("harshad");
     name.add("himashu");
     name.add("Ravi");
  }
    int index=0;
   
  
    
     @Override
    public boolean hasNext() {
       if(index<name.size())
       {
           return true;
       }
       return false;
    }

   
    @Override
    public Object Next() {
       if(index <= name.size() )
       {
           return name.get(index++);
       }
       return null;
    }



}
