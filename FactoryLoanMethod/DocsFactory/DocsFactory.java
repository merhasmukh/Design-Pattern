/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocsFactory;

/**
 *
 * @author Hasmukh
 */
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
