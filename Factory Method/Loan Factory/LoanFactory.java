
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
