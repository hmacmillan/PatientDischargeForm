package uk.nhs.scot.tayside.dal;

import uk.nhs.scot.tayside.dto.DischargeForm;
import uk.nhs.scot.tayside.dto.PatientDetails;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

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





        return dischargeForm;

    }

}
