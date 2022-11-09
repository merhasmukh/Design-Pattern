/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocsFactory;

/**
 *
 * @author Hasmukh
 */
import java.util.Scanner;
public class DocsClient {
    
    public static void main(String[] args) {
        
        
        CreateDocs crtdoc;
        DocsFactory docsfac;
        int choice;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Create Word Documents..");
        System.out.println("2.Create Excel Documents..");
        System.out.println("3.Create Pdf Documents..");
        System.out.println("4.Create Text Documents..");
        
        System.out.println("Enter Your Choice..!!");
        
        choice = sc.nextInt();
        
        crtdoc = DocsFactory.getDocumets(choice);
        
      
        System.out.println(crtdoc.createDoc());
        System.out.println(crtdoc.saveDoc());
        System.out.println(crtdoc.closeDoc());
         
    }
    
}
