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
public class VehicalLoanAccount implements LoanAccount {
    
    double ri,amt;
    int ny;

     public VehicalLoanAccount(){
        
        amt = 0;
        ri =0.0;
        ny=0;
    }
    @Override
    public double getInterest() {
        return (ny*ri*amt)/100;
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
        return "Minimum amount For Vehical Loan Is 500000 and Maximum Ammount is 5000000";
    }
    
}
