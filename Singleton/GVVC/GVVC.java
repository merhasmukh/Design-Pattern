
public class GVVC {
    
    String name;
    int age;
    private static GVVC mygvvc=null;
    public static int GVVC=0 ;
    private GVVC(String name)
    {
       this.name=name;
    }        
    public int getAge()
    {
    
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getVC()
    {
        return name+" he is "+ age +" years old";
    }
    public static GVVC getInstance(String name)
    {
         if(mygvvc == null)
        {    
            mygvvc = new GVVC(name);
        } 
        return mygvvc;
       
    }
    
    
}
