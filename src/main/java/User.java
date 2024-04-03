/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Etudiant
 */
public class User {
    private String name;
    private String forname;
    private String mail;
    private String password;
    
    
    public User(String  name,String forname, String mail) {
    this.name = name;
    this.forname = forname;
    this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getForname() {
        return forname;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean pregMatch(String pattern, String content) {
    return content.matches(pattern);
    }
    
    public boolean verifpassword(String mdp) {
        
        return pregMatch("/[a-z][0-9][]A-Z]/", mdp);
        
    }
}
