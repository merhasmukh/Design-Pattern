import java.io.File;
public class WordDocs implements CreateDocs {

    File f1=new File("file.pdf");
     @Override
    public String createDoc() {
         return "Your PDF Document Is Created.." + f1.getName();
    }
    
    @Override
    public String saveDoc() {
         return "Your PDF Document Is Saved To : " + f1.getAbsolutePath();
    }

    @Override
    public String closeDoc() {
        return "Your PDF Document Is Closed..";
    }

    

   
}
