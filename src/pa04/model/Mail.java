/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pa04.model;

/**
 *
 * @author usuario
 */
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return getMail().split("@")[1];
    }
}
