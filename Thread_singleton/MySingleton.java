
public class MySingleton {

    private static MySingleton instance = null;
    
    private MySingleton()
    {
    
    }
    public static MySingleton getinstance() throws InterruptedException{
    
        if(instance == null)
        {
            synchronized(MySingleton.class){
                if(instance == null)
                {
                    Thread.sleep(2000);
                    instance = new MySingleton();
                }    
            }
            
        }
    
        return instance;
    }
    
}
