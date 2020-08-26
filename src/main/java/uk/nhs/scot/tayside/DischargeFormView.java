package uk.nhs.scot.tayside;

import uk.nhs.scot.tayside.application.ApplicationValues;
import uk.nhs.scot.tayside.dal.TestDataProvider;
import uk.nhs.scot.tayside.dto.*;

import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

import org.primefaces.component.selectbooleancheckbox.*;

@ViewScoped
@Named
public class DischargeFormView implements Serializable {


    SelectBooleanCheckbox selectBooleanCheckbox = new SelectBooleanCheckbox();
    private DischargeForm currentDischargeForm;
    private Diagnosis diagnosisToAdd;
    private Procedure procedureToAdd;
    private Allergy allergyToAdd;
    private Medication medicationToAdd;

    private FollowUp followUpToAdd;

    private boolean discharged = true;
    @Inject
    private TestDataProvider testDataProvider;

    @Inject
    private ApplicationValues applicationValues;

    @PostConstruct
    public void init() {
        currentDischargeForm = testDataProvider.getTestDischargeForm();
        selectBooleanCheckbox.setDisabled(true);
        medicationToAdd = new Medication();
    }

    public void createNewDiagnosis() {
        diagnosisToAdd = new Diagnosis();
    }


    public void createNewProcedure() {
        procedureToAdd = new Procedure();
    }

    public void createNewMedication() {
        medicationToAdd = new Medication();
    }

    public void addNewMedicationToList() {
        System.out.println("addNewMedicationToList");

        currentDischargeForm.getMedicationList().add(medicationToAdd);
    }

    public void createNewAllergy() {
        allergyToAdd = new Allergy();
    }

    public void addNewAllergyToList() {
        currentDischargeForm.getAllergyList().add(allergyToAdd);
    }

    public void addNewProcedureToList() {
        currentDischargeForm.getProcedureList().add(procedureToAdd);
    }

    public void addNewDiagnosistoList() {
        currentDischargeForm.getDiagnosisList().add(diagnosisToAdd);
    }


    public void createNewFollowUp() {
        followUpToAdd = new FollowUp();
    }


    public void addNewFollowUpToList() {
        currentDischargeForm.getFollowUpList().add(followUpToAdd);
    }

    public DischargeForm getCurrentDischargeForm() {
        return currentDischargeForm;
    }

    public void setCurrentDischargeForm(DischargeForm currentDischargeForm) {
        this.currentDischargeForm = currentDischargeForm;
    }


    public boolean isDischarged() {
        return discharged;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }

    public Diagnosis getDiagnosisToAdd() {
        return diagnosisToAdd;
    }

    public void setDiagnosisToAdd(Diagnosis diagnosisToAdd) {
        this.diagnosisToAdd = diagnosisToAdd;
    }

    public Allergy getAllergyToAdd() {
        return allergyToAdd;
    }

    public void setAllergyToAdd(Allergy allergyToAdd) {
        this.allergyToAdd = allergyToAdd;
    }

    public Medication getMedicationToAdd() {
        return medicationToAdd;
    }

    public void setMedicationToAdd(Medication medicationToAdd) {
        this.medicationToAdd = medicationToAdd;
    }

    public Procedure getProcedureToAdd() {
        return procedureToAdd;
    }

    public void setProcedureToAdd(Procedure procedureToAdd) {
        this.procedureToAdd = procedureToAdd;
    }

    public SelectBooleanCheckbox getSelectBooleanCheckbox() {
        return selectBooleanCheckbox;
    }

    public void setSelectBooleanCheckbox(SelectBooleanCheckbox selectBooleanCheckbox) {
        this.selectBooleanCheckbox = selectBooleanCheckbox;
    }


    public FollowUp getFollowUpToAdd() {
        return followUpToAdd;
    }

    public void setFollowUpToAdd(FollowUp followUpToAdd) {
        this.followUpToAdd = followUpToAdd;
    }


    public void selectMedicationSupply() {
        System.out.println("select medication:" + medicationToAdd.getMedicationSupply().getMedicationSupplyID());


        String description = applicationValues.getMedicationSupplyMap().get(medicationToAdd.getMedicationSupply().getMedicationSupplyID()).getDescription();

        medicationToAdd.getMedicationSupply().setDescription(description);


    }
}
