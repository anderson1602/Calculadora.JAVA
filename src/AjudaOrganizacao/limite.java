
package AjudaOrganizacao;

import javax.swing.text.*;

public class limite  extends PlainDocument 
{
    private final int iMaxLength;

    public limite (int maxlen) {
        super();
        iMaxLength = maxlen;
    }

    public void insertString(int offset, String str, AttributeSet attr)
        throws BadLocationException {
        
        if (iMaxLength <= 0) {
            
            super.insertString(offset, str.toUpperCase(), attr);
            
            return;
        }

        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength){    
            
            super.insertString(offset, str.toUpperCase(), attr); 
        
        }else{
            
            super.insertString(offset, str.toUpperCase().substring(0,12), attr); 
        }
    }
}    