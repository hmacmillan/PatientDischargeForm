package uk.nhs.scot.tayside.session;

import uk.nhs.scot.tayside.dal.TrainingDB;
import uk.nhs.scot.tayside.dto.Patient;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SessionScoped
@Named
public class FormSession implements Serializable {


    private List<Patient> allPatientList;


    private Patient selectedPatient;


    private String selectedPatientChinumber;


    private Map<String, Patient> patientMap;


    @Inject
    private TrainingDB trainingDB;


    @PostConstruct
    public void init() {
        try {
            allPatientList = trainingDB.getAllPatients();

            patientMap = new HashMap<>();

            for (Patient patient : allPatientList) {
                patientMap.put(patient.getChinumber(), patient);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void selectPatient() {

        System.out.println("selectPatient:");

        System.out.println("chi number:" + selectedPatientChinumber);

        selectedPatient = patientMap.get(selectedPatientChinumber);

        System.out.println(selectedPatient);
    }


    public List<Patient> getAllPatientList() {
        return allPatientList;
    }

    public void setAllPatientList(List<Patient> allPatientList) {
        this.allPatientList = allPatientList;
    }


    public Patient getSelectedPatient() {
        return selectedPatient;
    }

    public void setSelectedPatient(Patient selectedPatient) {
        this.selectedPatient = selectedPatient;
    }


    public String getSelectedPatientChinumber() {
        return selectedPatientChinumber;
    }

    public void setSelectedPatientChinumber(String selectedPatientChinumber) {
        this.selectedPatientChinumber = selectedPatientChinumber;
    }


    public void testMethod() {
        System.out.println("test output");
    }

}
