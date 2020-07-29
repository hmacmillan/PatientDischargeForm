package uk.nhs.scot.tayside.dto;

import uk.nhs.scot.tayside.enumerator.DocStatus;
import uk.nhs.scot.tayside.enumerator.PharmacyStatus;

import java.util.ArrayList;
import java.util.List;

public class DischargeForm {


    private PatientDetails patientDetails;

    private DischargeDetails dischargeDetails;

    private List<Diagnosis> diagnosisList;

    private List<Procedure> procedureList;

    private List<Allergy> allergyList;

    private List<DeletedAllergy> deletedAllergyList;

    private List<Medication> medicationList;

    private List<DiscontinuedMedication> discontinuedMedicationList;

    private String medicationComments;

    private String communicationToPrimaryCare;

    private String actionsRequiredByPrimaryCare;

    private List<FollowUp> followUpList;

    private String pharmacyComment;

    private String finalDischargeComments;

    private DocStatus docStatus;

    private PharmacyStatus pharmacyStatus;

    private SignOff initialSignOff;

    private SignOff pharmacySignOff;

    private SignOff finalSignOff;

    private List<CopyTo> copyToList;

    private List<AuditEvent> auditEventList;


    public DischargeForm() {
        this.patientDetails = new PatientDetails();
        this.dischargeDetails = new DischargeDetails();
        this.diagnosisList = new ArrayList<>();
        this.procedureList = new ArrayList<>();
        this.allergyList = new ArrayList<>();
        this.deletedAllergyList = new ArrayList<>();
        this.medicationList = new ArrayList<>();
        this.discontinuedMedicationList = new ArrayList<>();
        this.followUpList = new ArrayList<>();
        this.initialSignOff = new SignOff();
        this.pharmacySignOff = new SignOff();
        this.finalSignOff = new SignOff();
        this.copyToList = new ArrayList<>();
        this.auditEventList = new ArrayList<>();
    }

    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(PatientDetails patientDetails) {
        this.patientDetails = patientDetails;
    }

    public DischargeDetails getDischargeDetails() {
        return dischargeDetails;
    }

    public void setDischargeDetails(DischargeDetails dischargeDetails) {
        this.dischargeDetails = dischargeDetails;
    }

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }

    public List<Procedure> getProcedureList() {
        return procedureList;
    }

    public void setProcedureList(List<Procedure> procedureList) {
        this.procedureList = procedureList;
    }

    public List<Allergy> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(List<Allergy> allergyList) {
        this.allergyList = allergyList;
    }

    public List<DeletedAllergy> getDeletedAllergyList() {
        return deletedAllergyList;
    }

    public void setDeletedAllergyList(List<DeletedAllergy> deletedAllergyList) {
        this.deletedAllergyList = deletedAllergyList;
    }

    public List<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public List<DiscontinuedMedication> getDiscontinuedMedicationList() {
        return discontinuedMedicationList;
    }

    public void setDiscontinuedMedicationList(List<DiscontinuedMedication> discontinuedMedicationList) {
        this.discontinuedMedicationList = discontinuedMedicationList;
    }

    public String getMedicationComments() {
        return medicationComments;
    }

    public void setMedicationComments(String medicationComments) {
        this.medicationComments = medicationComments;
    }

    public String getCommunicationToPrimaryCare() {
        return communicationToPrimaryCare;
    }

    public void setCommunicationToPrimaryCare(String communicationToPrimaryCare) {
        this.communicationToPrimaryCare = communicationToPrimaryCare;
    }

    public String getActionsRequiredByPrimaryCare() {
        return actionsRequiredByPrimaryCare;
    }

    public void setActionsRequiredByPrimaryCare(String actionsRequiredByPrimaryCare) {
        this.actionsRequiredByPrimaryCare = actionsRequiredByPrimaryCare;
    }

    public List<FollowUp> getFollowUpList() {
        return followUpList;
    }

    public void setFollowUpList(List<FollowUp> followUpList) {
        this.followUpList = followUpList;
    }

    public String getPharmacyComment() {
        return pharmacyComment;
    }

    public void setPharmacyComment(String pharmacyComment) {
        this.pharmacyComment = pharmacyComment;
    }

    public DocStatus getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(DocStatus docStatus) {
        this.docStatus = docStatus;
    }

    public PharmacyStatus getPharmacyStatus() {
        return pharmacyStatus;
    }

    public void setPharmacyStatus(PharmacyStatus pharmacyStatus) {
        this.pharmacyStatus = pharmacyStatus;
    }

    public SignOff getInitialSignOff() {
        return initialSignOff;
    }

    public void setInitialSignOff(SignOff initialSignOff) {
        this.initialSignOff = initialSignOff;
    }

    public SignOff getPharmacySignOff() {
        return pharmacySignOff;
    }

    public void setPharmacySignOff(SignOff pharmacySignOff) {
        this.pharmacySignOff = pharmacySignOff;
    }

    public SignOff getFinalSignOff() {
        return finalSignOff;
    }

    public void setFinalSignOff(SignOff finalSignOff) {
        this.finalSignOff = finalSignOff;
    }

    public List<CopyTo> getCopyToList() {
        return copyToList;
    }

    public void setCopyToList(List<CopyTo> copyToList) {
        this.copyToList = copyToList;
    }

    public List<AuditEvent> getAuditEventList() {
        return auditEventList;
    }

    public void setAuditEventList(List<AuditEvent> auditEventList) {
        this.auditEventList = auditEventList;
    }

    public String getFinalDischargeComments() {
        return finalDischargeComments;
    }

    public void setFinalDischargeComments(String finalDischargeComments) {
        this.finalDischargeComments = finalDischargeComments;
    }
}
