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
public class LoanFactory {
    
    
    
    public static LoanAccount getLoanAccount(int acctype)
    {
        if(acctype == 1)
        {
          return new HomeLoanAccount();
                    
        }
        else if(acctype == 2)
        {
            return new PersonalLoanAccount();
        }
        else if(acctype == 3)
        {
            return new VehicalLoanAccount();
        }
        else
            
        {
            return null;
        }
    }
    
}
