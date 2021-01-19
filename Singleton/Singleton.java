   public class Singleton {
   
   public static void main(String[] args) {
        // TODO code application logic here
        GVVC mygvvc=GVVC.getInstance("Prof.Anamik Shah");
        mygvvc.setAge(65);
        System.out.println(mygvvc.getVC());
        GVVC mygvvc2=GVVC.getInstance("Prof. Shah");
        
        
        mygvvc2.setAge(56);
        System.out.println(mygvvc2.getVC());
        
       /*GVVC mygvvc3=GVVC.getInstance("Prof.Anamik ");
        System.out.println(mygvvc3.getVC());*/
        
    }
    
}
