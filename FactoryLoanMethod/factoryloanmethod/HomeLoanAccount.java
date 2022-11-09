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
public class HomeLoanAccount implements LoanAccount {
    
    double amt,ri;
    int ny;
    
    public HomeLoanAccount(){
        
        amt = 0;
        ri =0.0;
        ny=0;
    }

    @Override
    public double getInterest() {
        
        return (amt*ri*ny)/100;

    }

    @Override
    public void setRateofInt(double r) {
        
        this.ri=r;
    }

    @Override
    public void setLoanAmount(double lamt) {
        
        this.amt=lamt;
    }

    @Override
    public void setNoofYear(int n) {
        
        this.ny=n;

    }

    @Override
    public String TermCond() {

            return "Minimum amount For Home Loan Is 50000 and Maximum Ammount is 500000";
    }
    
}
