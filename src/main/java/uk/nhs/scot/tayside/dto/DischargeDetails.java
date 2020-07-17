package uk.nhs.scot.tayside.dto;

import java.time.LocalDate;

public class DischargeDetails {

    private LocalDate admissionDate;
    private LocalDate estimatedDischargeDate;
    private LocalDate dischargeDate;

    private String dischargeSpecialty;
    private String dischargeConsultant;
    private String dischargeConsultantGMC;

    private String dischargeLocation;
    private String dischargeDestination;
    private String dischargeDestinationDetails;


    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getEstimatedDischargeDate() {
        return estimatedDischargeDate;
    }

    public void setEstimatedDischargeDate(LocalDate estimatedDischargeDate) {
        this.estimatedDischargeDate = estimatedDischargeDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getDischargeSpecialty() {
        return dischargeSpecialty;
    }

    public void setDischargeSpecialty(String dischargeSpecialty) {
        this.dischargeSpecialty = dischargeSpecialty;
    }

    public String getDischargeConsultant() {
        return dischargeConsultant;
    }

    public void setDischargeConsultant(String dischargeConsultant) {
        this.dischargeConsultant = dischargeConsultant;
    }

    public String getDischargeConsultantGMC() {
        return dischargeConsultantGMC;
    }

    public void setDischargeConsultantGMC(String dischargeConsultantGMC) {
        this.dischargeConsultantGMC = dischargeConsultantGMC;
    }

    public String getDischargeLocation() {
        return dischargeLocation;
    }

    public void setDischargeLocation(String dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
    }

    public String getDischargeDestination() {
        return dischargeDestination;
    }

    public void setDischargeDestination(String dischargeDestination) {
        this.dischargeDestination = dischargeDestination;
    }

    public String getDischargeDestinationDetails() {
        return dischargeDestinationDetails;
    }

    public void setDischargeDestinationDetails(String dischargeDestinationDetails) {
        this.dischargeDestinationDetails = dischargeDestinationDetails;
    }


}
