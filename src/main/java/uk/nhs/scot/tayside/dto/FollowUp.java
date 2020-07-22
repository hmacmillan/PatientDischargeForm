package uk.nhs.scot.tayside.dto;

import java.time.LocalDateTime;

public class FollowUp {

    private String clinic;
    private String doctor;
    private String appointmentLocation;
    private boolean appointmentNeeded;
    private LocalDateTime appointmentDateTime;


    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentLocation() {
        return appointmentLocation;
    }

    public void setAppointmentLocation(String appointmentLocation) {
        this.appointmentLocation = appointmentLocation;
    }

    public boolean isAppointmentNeeded() {
        return appointmentNeeded;
    }

    public void setAppointmentNeeded(boolean appointmentNeeded) {
        this.appointmentNeeded = appointmentNeeded;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
}
