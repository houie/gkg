package com.houie.gkg.lang;

/**
 * Created by houie on 8/1/2017.
 */
public class Shareholder {

    private String firstname;
    private String lastname;

    public Shareholder(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return  this.lastname;
    }

    public String getFullname() {
        return this.firstname + " " + this.lastname;
    }

   public int hashCode() {
        return getFullname().hashCode();
    }
}
