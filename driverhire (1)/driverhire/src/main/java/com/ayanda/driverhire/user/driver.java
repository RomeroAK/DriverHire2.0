package com.ayanda.driverhire.user;

import java.util.Date;

public class driver extends SystemUser {

    String licenseType;
    Date dateAcuiredLicense;

    public driver() {

    }

    public driver(String userType, String email, String lName, String fName, String licenseType, Date dateAcuiredLicense) {
        super(userType, email, lName, fName);
        this.licenseType = licenseType;
        this.dateAcuiredLicense = dateAcuiredLicense;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public Date getDateAcuiredLicense() {
        return dateAcuiredLicense;
    }

    public void setDateAcuiredLicense(Date dateAcuiredLicense) {
        this.dateAcuiredLicense = dateAcuiredLicense;
    }

    @Override
    public String toString() {
        return "driver{" +
                "licenseType='" + licenseType + '\'' +
                ", dateAcuiredLicense=" + dateAcuiredLicense +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
