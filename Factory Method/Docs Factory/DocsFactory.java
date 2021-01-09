public class DocsFactory {
    
    
    public static CreateDocs getDocumets(int doctype)
    {
        switch (doctype) {
            case 1:
                return new WordDocs();
            case 2:
                return new ExcelDocs();
            case 3:
                return new PdfDocs();
            case 4:
                return new  TextDocs();
            default:
                return null;
        }
    }
    
}
