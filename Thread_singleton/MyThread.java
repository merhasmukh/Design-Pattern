
public class MyThread  implements  Runnable{

    @Override
    public void run() {
        try {
            MySingleton single = MySingleton.getinstance();
            System.out.println(Thread.currentThread().getName()+" "+single.hashCode());
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
