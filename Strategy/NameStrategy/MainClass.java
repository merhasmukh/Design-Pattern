/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameStrategy;

/**
 *
 * @author Hasmukh
 */
public class MainClass {
    public static void main(String[] args) {
        
        NameContext nc = new NameContext(new UpperCase());
       System.out.println(nc.getBName());
    }
    
}
