
public class Mainclass {
    
    public static void main(String[] args) {
        
    
    
    PrintSpooler ps = PrintSpooler.getInstance();
       ps.setMessage("First message");
       ps.print("Mr. Ajay");
       PrintSpooler ps1 = PrintSpooler.getInstance();
       ps1.setMessage("Second Message");
       ps1.print("Mr Ramesh");
       ps.print("Mr Kamal");
       ps.setMessage("XYZ");
       ps1.print("Prifix ps1");
       ps.print("prefixps ");
       
    }   
}
