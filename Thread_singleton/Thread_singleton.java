
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Thread_singleton {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ExecutorService exeser = null;
        MyThread thread= new MyThread();
        try {
            exeser = Executors.newFixedThreadPool(5);
            exeser.execute(thread);
            exeser.execute(thread);
            exeser.execute(thread);
            exeser.execute(thread);
            exeser.execute(thread);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            exeser.shutdown();
        }
    }
    
}
