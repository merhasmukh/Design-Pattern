/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stationary;

/**
 *
 * @author st
 */
public class Stationary {
    
    private Pens pen;
    private Pencils pencil;
    
   public Stationary(){
       
       pen = new Pens();
       pencil = new Pencils();
   
   }
  
   
   public void getPen(){
   
     pen.getPen();
 
   
   }
   
public void getPencil(){
    pencil.getPrice();
    pencil.getPencil();
}
    
    
}
    

