package uk.nhs.scot.tayside.dal;

import uk.nhs.scot.tayside.dto.Diagnosis;
import uk.nhs.scot.tayside.dto.DischargeDetails;
import uk.nhs.scot.tayside.dto.DischargeForm;
import uk.nhs.scot.tayside.dto.PatientDetails;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDate;

@SessionScoped
public class TestDataProvider implements Serializable {


    public DischargeForm getTestDischargeForm()
    {
        DischargeForm dischargeForm = new DischargeForm();

        PatientDetails patientDetails = new PatientDetails();

        patientDetails.setGpPractice("Links Health Centre");

        patientDetails.getGpPracticeAddress().setAddress("45 Mains Lane, Dundee");

        patientDetails.setFirstName("James");

        patientDetails.setSurname("Brown");


        patientDetails.setChiNumber("0123456789");

        patientDetails.getPatientAddress().setAddress("45 Green Avenue");


        dischargeForm.setPatientDetails(patientDetails);

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

        Diagnosis diagnosis1 = new Diagnosis();
        diagnosis1.setDiagnosisName("diagnosis 1");

        diagnosis1.setDiagnosisDetail("detail 1");

        dischargeForm.getDiagnosisList().add(diagnosis1);


        Diagnosis diagnosis2 = new Diagnosis();
        diagnosis2.setDiagnosisName("diagnosis 2");

        diagnosis2.setDiagnosisDetail("detail 2");

        dischargeForm.getDiagnosisList().add(diagnosis2);





        return dischargeForm;

    }

}
