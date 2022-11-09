/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Website;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hasmukh
 */


public class ProxySites implements WebInterface {
   static List<String> bansite;
   static {
        bansite = Arrays.asList("https://www.facebook.com","https://www.tiktok.com","https://www.instagram.com","https://www.whatsapp.com",
                "http://www.torrentz2.eu","https://www.aliexpress.com","https://www.yourvideohost.com","https://www.yehh.com");
   }
   
   
   

    @Override
    public void doConnect(String str) {
		
		
        RealSites wib =new RealSites();
      
             
         
             if(bansite.contains(str)){
                 
                wib.doConnect("This Site Is Banned ..!!");
             
             }
             else
             {
                wib.doConnect(str);
                    
             }
             
         
         }
         
         
       
    }
        
    

