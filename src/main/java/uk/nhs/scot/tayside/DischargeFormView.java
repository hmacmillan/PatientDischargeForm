package uk.nhs.scot.tayside;

import uk.nhs.scot.tayside.dal.TestDataProvider;
import uk.nhs.scot.tayside.dto.DischargeForm;

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



    private DischargeForm currentDischargeForm;



    private boolean discharged = true;

    @Inject
    private TestDataProvider testDataProvider;

SelectBooleanCheckbox selectBooleanCheckbox = new SelectBooleanCheckbox();

    public SelectBooleanCheckbox getSelectBooleanCheckbox() {
        return selectBooleanCheckbox;
    }

    public void setSelectBooleanCheckbox(SelectBooleanCheckbox selectBooleanCheckbox) {
        this.selectBooleanCheckbox = selectBooleanCheckbox;
    }

    @PostConstruct
    public void init(){

        currentDischargeForm = testDataProvider.getTestDischargeForm();

        selectBooleanCheckbox.setDisabled(true);




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
}
