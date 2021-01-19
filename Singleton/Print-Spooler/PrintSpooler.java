

public class PrintSpooler {
    
     private static PrintSpooler spooler;
    private String message;

    static {
        spooler = new PrintSpooler();
    }

    private PrintSpooler() { }

    public static PrintSpooler getInstance() {
        return spooler;
        
    }

    public void print(String prefix) {
        if( message != null)
            System.out.println(prefix + " - " + message);
        else
            System.out.println(prefix + " - error");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
  
