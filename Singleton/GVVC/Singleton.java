   public class Singleton {
   
   public static void main(String[] args) {
       
        GVVC mygvvc=GVVC.getInstance("Prof.Anamik Shah");
        mygvvc.setAge(65);
        System.out.println(mygvvc.getVC());
        GVVC mygvvc2=GVVC.getInstance("Prof. Shah");
        
        
        mygvvc2.setAge(56);
        System.out.println(mygvvc2.getVC());
        
       
        
    }
    
}
