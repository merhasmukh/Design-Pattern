/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameRepository;

/**
 *
 * @author Hasmukh
 */
public class ConcreteContainer implements Container {
protected int choice;
    @Override
    public IteratorInterface getIterator(int choice) {
        
        switch(choice)
        {
            case 1:
             return new Namerepository();
            case 2:
                return new MobNumberRepo();
        }
       return null;
    }
}
    

