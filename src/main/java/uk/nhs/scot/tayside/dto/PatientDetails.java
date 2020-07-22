package uk.nhs.scot.tayside.dto;

public class PatientDetails {

    private String gpPractice;
    private GPAddress gpPracticeAddress;
    private String firstName;
    private String surname;
    private String chiNumber;
    private PatientAddress patientAddress;

    public PatientDetails() {
        this.gpPracticeAddress = new GPAddress();
        this.patientAddress = new PatientAddress();
    }

    public String getGpPractice() {
        return gpPractice;
    }

    public void setGpPractice(String gpPractice) {
        this.gpPractice = gpPractice;
    }

    public GPAddress getGpPracticeAddress() {
        return gpPracticeAddress;
    }

    public void setGpPracticeAddress(GPAddress gpPracticeAddress) {
        this.gpPracticeAddress = gpPracticeAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getChiNumber() {
        return chiNumber;
    }

    public void setChiNumber(String chiNumber) {
        this.chiNumber = chiNumber;
    }

    public PatientAddress getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(PatientAddress patientAddress) {
        this.patientAddress = patientAddress;
    }


    public String printFullDeatails()
    {
        return this.firstName + " " + this.surname + " (" + this.chiNumber + ")";
    }

}
