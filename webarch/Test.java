/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webarch;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 *
 * @author benhur
 */
public class Test {
    public static void main(String[] args){
	try {
	    System.out.println("EmployeeRequest.xml validates against Employee.xsd? "
		    +validateXMLSchema("ACMTrento.xsd", "ACMTrento.xml"));
	} catch (SAXException ex) {
	    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
	}
	
    }
    
      public static boolean validateXMLSchema(String xsdPath, String xmlPath) throws SAXException{
        
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
    
}
