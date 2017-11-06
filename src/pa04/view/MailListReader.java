/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pa04.view;
import pa04.model.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class MailListReader {
    public static List<Mail> read(String FileName)throws FileNotFoundException, IOException{
        List<Mail>mailList=new ArrayList<>();
        BufferedReader reader =new BufferedReader(new FileReader(new File(FileName)));
        String mail=reader.readLine();
        while((mail != null)){
            if (mail.contains("@")){
                mailList.add(new Mail(mail)); 
            }
        }
        reader.close();
        return mailList;
        
    }
    
}
