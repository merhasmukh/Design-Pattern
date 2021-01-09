
import java.io.File;

public class TextDocs implements CreateDocs {

    File f1=new File("file.txt");
     @Override
    public String createDoc() {
        
       
       
        return ("Your TEXT Document Is Created.." + f1.getName());
      
    }
    
    @Override
    public String saveDoc() {
         return ("Your TEXT Document Is Saved To :"+ f1.getAbsolutePath());
    }

    @Override
    public String closeDoc() {
        return "Your TEXT Document Is Closed..";
    }

    
}
