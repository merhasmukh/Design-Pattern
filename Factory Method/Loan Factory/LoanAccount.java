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
public interface LoanAccount {
    
    
    public double getInterest();
    public void setRateofInt(double r);
    public void setLoanAmount(double lamt);
    public void setNoofYear(int n);
    public String TermCond();
    
    
    
    
}
