/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryloanmethod;

/**
 *
 * @author Hasmukh
 */
import java.util.Scanner;
public class LoanAccountClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoanAccount lacc;
        LoanFactory lf;
        int choice;
        
        Scanner in = new Scanner(System.in);
        System.out.println("1.Home Loan Account");
        System.out.println("2.Personal Loan Account");
        System.out.println("3.Vehical Loan Account");
        System.out.println("Enter your choice:");
        
        choice = in.nextInt();
        
        lacc = LoanFactory.getLoanAccount(choice);
        lacc.setRateofInt(9.8);
        lacc.setNoofYear(5);
        lacc.setLoanAmount(500000);
        System.out.println(lacc.TermCond());
        System.out.println("Interest Amount Is: " + lacc.getInterest());   
    }
    
}
