package uk.nhs.scot.tayside.dto;

import java.time.LocalDate;

public class Patient {

    private String chinumber;
    private String forename;
    private String surname;
    private String gender;
    private String address;
    private String postcode;


    private LocalDate dateOfBirth;


    public String getChinumber() {
        return chinumber;
    }

    public void setChinumber(String chinumber) {
        this.chinumber = chinumber;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "chinumber='" + chinumber + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
