package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String aboutUs;
    private String wouldLike;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        aboutUs="";
        wouldLike="";
        contact="";
    }

    public User(String firstName, String lastName, String email,String where,String Like, String connect) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.aboutUs=Like;
        this.wouldLike=where;
        this.contact=connect;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutus(String aboutUs) {
        this.aboutUs = aboutUs;
    }
    public String getWouldLike() {
        return wouldLike;
    }

    public void setWouldLike(String wouldLike) {
        this.wouldLike = wouldLike;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}