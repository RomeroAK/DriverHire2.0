package com.ayanda.driverhire.user;

import jakarta.persistence.*;


@Entity
@Table(name = "Users")
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userID;
    String fName;
    String lName;
    String email;
    String userType;

    public SystemUser(){}

    public SystemUser(String userType, String email, String lName, String fName) {
        this.userType = userType;
        this.email = email;
        this.lName = lName;
        this.fName = fName;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "user{" +
                "userID=" + userID +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}