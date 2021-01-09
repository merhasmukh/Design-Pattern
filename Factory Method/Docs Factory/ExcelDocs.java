
 import java.io.File;

public class ExcelDocs implements CreateDocs {

     File f1=new File("file.xlsx");
     @Override
    public String createDoc() {
        return "Your Document Is Created.." + f1.getName();
    }
    
    @Override
    public String saveDoc() {
         return "Your Document Is Saved To : " + f1.getAbsolutePath();
    }

    @Override
    public String closeDoc() {
        return "Your Document Is Closed..";
    }

    
}
