/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webarch;

/**
 *
 * @author benhur
 */
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class XSLTTest
{
   
    public static void main(String[] args)throws IOException, 
	    URISyntaxException, TransformerException  {
                try
        {
               TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(new File("Arch.xsl"));
        Transformer transformer = factory.newTransformer(xslt);

        Source text = new StreamSource(new File("ACMTrento.xml"));
        transformer.transform(text, new StreamResult(new File("output.csv")));
    }
        
        catch (Exception e)
        {
          e.printStackTrace();
        }
        
    }

}

