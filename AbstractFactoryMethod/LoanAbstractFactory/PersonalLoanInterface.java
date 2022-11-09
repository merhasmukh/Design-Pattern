/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanAbstractFactory;

/**
 *
 * @author Hasmukh
 */
public interface PersonalLoanInterface {
    
    public void setLoanAmount();
    public double getLoanAmount();
    public double getRateOfInterest();
    public int setNoOfYear();
    public String TermAndCond();
    
}
