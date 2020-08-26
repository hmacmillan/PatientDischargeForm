package uk.nhs.scot.tayside.dal;

import uk.nhs.scot.tayside.dto.*;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SessionScoped
public class TestDataProvider implements Serializable {

    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


    public DischargeForm getTestDischargeForm() {

        DischargeForm dischargeForm = new DischargeForm();

        addPatientDetails(dischargeForm);
        addDischargeDetails(dischargeForm);
        addDiagnoses(dischargeForm);

        addProcedures(dischargeForm);
        addAllergies(dischargeForm);
        addDeletedAllergies(dischargeForm);

        addMedication(dischargeForm);
        addDiscontinuedMedicines(dischargeForm);
        addFollowUp(dischargeForm);


        dischargeForm.setMedicationComments("Medication notes test text");

        dischargeForm.setCommunicationToPrimaryCare("Communication to primary care test text");

        dischargeForm.setActionsRequiredByPrimaryCare("Actions required by primary care test text");

        dischargeForm.setFinalDischargeComments("Final disharge comments test text");

        dischargeForm.setPharmacyComment("Pharmacy Comment test text");


        return dischargeForm;

    }


    private void addPatientDetails(DischargeForm dischargeForm) {
        PatientDetails patientDetails = new PatientDetails();

        patientDetails.setGpPractice("Links Health Centre");

        patientDetails.getGpPracticeAddress().setAddress("45 Mains Lane, Dundee");

        patientDetails.setFirstName("James");

        patientDetails.setSurname("Brown");


        patientDetails.setChiNumber("0123456789");

        patientDetails.getPatientAddress().setAddress("45 Green Avenue");


        dischargeForm.setPatientDetails(patientDetails);
    }


    private void addDischargeDetails(DischargeForm dischargeForm) {
        DischargeDetails dischargeDetails = new DischargeDetails();

        dischargeDetails.setAdmissionDate(LocalDate.of(2019, 12, 31));
        dischargeDetails.setEstimatedDischargeDate(LocalDate.of(2020, 6, 21));
        dischargeDetails.setDischargeDate(LocalDate.of(2020, 6, 29));

        dischargeDetails.setDischargeSpecialty("Cardiology");
        dischargeDetails.setDischargeConsultant("Dr Alan Green");
        dischargeDetails.setDischargeConsultantGMC("1234567");

        dischargeDetails.setDischargeLocation("Acute Medical Unit Ninewells Hospital");
        dischargeDetails.setDischargeDestination("Care Home");
        dischargeDetails.setDischargeDestinationDetails("Maryfield Nursing Home");

        dischargeForm.setDischargeDetails(dischargeDetails);
    }

    private void addDiagnoses(DischargeForm dischargeForm) {

        Diagnosis diagnosis1 = new Diagnosis();
        diagnosis1.setDiagnosisName("diagnosis 1");

        diagnosis1.setDiagnosisDetail("detail 1");

        dischargeForm.getDiagnosisList().add(diagnosis1);
        Diagnosis diagnosis2 = new Diagnosis();
        diagnosis2.setDiagnosisName("diagnosis 2");

        diagnosis2.setDiagnosisDetail("detail 2");

        dischargeForm.getDiagnosisList().add(diagnosis2);


    }

    private void addProcedures(DischargeForm dischargeForm) {

        Procedure procedure1 = new Procedure();
        procedure1.setProcedureName("Procedure name 1");
        procedure1.setProcedureDetail("Procedure detail 1");
        procedure1.setProcedureDate(LocalDate.of(2020, 1, 6));
        dischargeForm.getProcedureList().add(procedure1);

        Procedure procedure2 = new Procedure();
        procedure2.setProcedureName("Procedure name 2");
        procedure2.setProcedureDetail("Procedure detail 2");
        procedure2.setProcedureDate(LocalDate.of(2020, 2, 6));
        dischargeForm.getProcedureList().add(procedure2);


    }

    private void addAllergies(DischargeForm dischargeForm) {

        Allergy allergy1 = new Allergy();

        allergy1.setSubstance("substance 1");
        allergy1.setReaction("reaction 1");
        allergy1.setSource("source 1");
        allergy1.setDateRecorded(LocalDate.parse("01/01/2020", dateFormatter));
        dischargeForm.getAllergyList().add(allergy1);

        Allergy allergy2 = new Allergy();

        allergy2.setSubstance("substance 2");
        allergy2.setReaction("reaction 2");
        allergy2.setSource("source 2");
        allergy2.setDateRecorded(LocalDate.parse("02/10/2020", dateFormatter));
        dischargeForm.getAllergyList().add(allergy2);


    }

    private void addDeletedAllergies(DischargeForm dischargeForm) {

        DeletedAllergy deletedAllergy1 = new DeletedAllergy();
        deletedAllergy1.setSubstance("substance 1");
        deletedAllergy1.setReaction("reaction 1");
        deletedAllergy1.setSource("source 1");
        deletedAllergy1.setDateRecorded(LocalDate.parse("01/01/2020", dateFormatter));
        deletedAllergy1.setDeletionReason("deletion reason 1");

        dischargeForm.getDeletedAllergyList().add(deletedAllergy1);

        DeletedAllergy deletedAllergy2 = new DeletedAllergy();
        deletedAllergy2.setSubstance("substance 2");
        deletedAllergy2.setReaction("reaction 2");
        deletedAllergy2.setSource("source 2");
        deletedAllergy2.setDateRecorded(LocalDate.parse("01/02/2020", dateFormatter));
        deletedAllergy2.setDeletionReason("deletion reason 2");

        dischargeForm.getDeletedAllergyList().add(deletedAllergy2);

    }

    private void addMedication(DischargeForm dischargeForm) {

        Medication medication1 = new Medication();

        medication1.setDescription("description 1");
        medication1.setDispensary("dispensary 1");
        medication1.setDose("dose 1");
        medication1.setInstructions("instructions 1");
        medication1.setDuration("duration 1");


        // medication1.setSupply("supply 1");

        medication1.setMedicationSupply(new MedicationSupply(1, "Own Supply"));
        medication1.setOtherSupply("other supply 1");
        medication1.setQuantity("quantity 1");

        dischargeForm.getMedicationList().add(medication1);

        Medication medication2 = new Medication();

        medication2.setDescription("description 2");
        medication2.setDispensary("dispensary 2");
        medication2.setDose("dose 2");
        medication2.setInstructions("instructions 2");
        medication2.setDuration("duration 2");

        medication2.setMedicationSupply(new MedicationSupply(2, "Hospital Pharmacy"));
        medication2.setOtherSupply("other supply 2");
        medication2.setQuantity("quantity 2");

        dischargeForm.getMedicationList().add(medication2);


    }

    private void addDiscontinuedMedicines(DischargeForm dischargeForm) {

        DiscontinuedMedication discontinuedMedication1 = new DiscontinuedMedication();

        discontinuedMedication1.setDescription("description 1");
        discontinuedMedication1.setDiscontinueReason("discontinue reason 1 ");
        discontinuedMedication1.setInstructions("instructions 1");
        discontinuedMedication1.setPermanency("permanency 1");

        dischargeForm.getDiscontinuedMedicationList().add(discontinuedMedication1);

        DiscontinuedMedication discontinuedMedication2 = new DiscontinuedMedication();

        discontinuedMedication2.setDescription("description 2");
        discontinuedMedication2.setDiscontinueReason("discontinue reason 2 ");
        discontinuedMedication2.setInstructions("instructions 2");
        discontinuedMedication2.setPermanency("permanency 2");

        dischargeForm.getDiscontinuedMedicationList().add(discontinuedMedication2);



    }

    private void addFollowUp(DischargeForm dischargeForm) {

        FollowUp followUp1 = new FollowUp();
        followUp1.setClinic("clinic 1");
        followUp1.setDoctor("doctor 1");
        followUp1.setAppointmentLocation("appointment 1");

        followUp1.setAppointmentDateTime(LocalDateTime.parse("01/02/2020 09:30",dateTimeFormatter));
        followUp1.setAppointmentNeeded(true);

        dischargeForm.getFollowUpList().add(followUp1);


        FollowUp followUp2 = new FollowUp();
        followUp2.setClinic("clinic 2");
        followUp2.setDoctor("doctor 2");
        followUp2.setAppointmentLocation("appointment 2");


        followUp2.setAppointmentNeeded(false);

        dischargeForm.getFollowUpList().add(followUp2);

    }

}
