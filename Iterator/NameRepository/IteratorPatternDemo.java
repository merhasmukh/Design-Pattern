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
import java.util.Scanner;

public class IteratorPatternDemo {
    
    public static void main(String[] args) {
        int ch;
        ConcreteContainer cnt = new ConcreteContainer();
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Choice..!!");
        System.out.println("1.Name List");
        System.out.println("2.Mobile Number");
                
        ch = sc.nextInt();
        IteratorInterface itr =  cnt.getIterator(ch);
        
        
        while(itr.hasNext())
        {
            
            System.out.println(" "+ itr.Next());            
        
        }
      
        
        
    }
    
}
