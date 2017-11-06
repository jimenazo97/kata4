/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pa04.view;
import java.util.*;
import pa04.model.*;

/**
 *
 * @author usuario
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail>mail){
        Histogram<String>histo=new Histogram<>();
        for(Mail mail1:mail){
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
    
}
