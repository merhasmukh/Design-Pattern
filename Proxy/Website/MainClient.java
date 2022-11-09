/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Website;

import java.util.Scanner;

/**
 *
 * @author Hasmukh
 */
public class MainClient {
    
    public static void main(String[] args) {
        
        WebInterface px = new ProxySites();
        px.doConnect("https://www.gujaratvidyapith.org");
        px.doConnect("https://www.facebook.com");
    }
    
}
