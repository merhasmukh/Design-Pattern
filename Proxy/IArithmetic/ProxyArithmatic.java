/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IArithmetic;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author Hasmukh
 */
public class ProxyArithmatic  implements IArithmatic{
   
    @Override
    public float doIt(float a, float b) {
         try{
             float a1 = a;
             float b1 =b;
             float ans;
             float status = (float) 1.0;
         
        File f = new File("log.txt");
        String s="Answer is -> ";
        FileOutputStream fo = new FileOutputStream(f);
        BufferedOutputStream bf =new BufferedOutputStream(fo);
        
       byte bt [] = s.getBytes();
       
       RealArithmatic ra= new RealArithmatic();
               ans =ra.doIt(a1, b1);
               s=s+ans;
               bf.write(bt);
               bf.close();
               fo.close();
               return status;
       
       
    }catch(IOException ioe){
        ioe.printStackTrace();
    }
   
   
    return 0;
        
        
    }

   
    
    
}
