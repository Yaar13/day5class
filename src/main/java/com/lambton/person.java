package com.lambton;
import java.util.Date;
public class person {

    private String Firstname;
    private String Lastname;
    private String Serialid;
    private String Email;
    private String ContactNumber;


    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getSerialid() {
        return Serialid;
    }

    public void setSerialid(String serialid) {
        Serialid = serialid;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        Dateofbirth = dateofbirth;
    }

    private String Dateofbirth;
}
    public com.lambton.computer getComputer() {
        return computer;
    }

    public void setComputer(com.lambton.computer computer) {
        this.computer = computer;
    }

    private computer computer;



