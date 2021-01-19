public class App {
    
 

    public static void main(String[] args) {
       SingleThread();
       MutiThread();
    }

    public static void SingleThread() {
        PrintSpooler spooler1 = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance();

        spooler1.setMessage("test");

        spooler1.print("spooler1"+spooler1 );
        spooler2.print("spooler2"+spooler2);
    }

    public static void MutiThread() {
        // create & setup message in separate thread
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                String threadName = "Word";
                System.out.println("START "+threadName);
                PrintSpooler spooler = PrintSpooler.getInstance();
                spooler.setMessage("thread message");
                spooler.print(threadName+spooler);
            }
        });

        // print the message in other thread
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                String threadName = "PPT";
                System.out.println("START "+threadName);
                PrintSpooler spooler = PrintSpooler.getInstance();
                spooler.print(threadName+spooler);
            }
        });

        t1.start();
        t2.start();
    }
}
