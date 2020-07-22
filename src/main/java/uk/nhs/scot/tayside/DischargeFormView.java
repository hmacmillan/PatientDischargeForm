package uk.nhs.scot.tayside;

import uk.nhs.scot.tayside.dal.TestDataProvider;
import uk.nhs.scot.tayside.dto.DischargeForm;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class DischargeFormView implements Serializable {



    private DischargeForm currentDischargeForm;

    @Inject
    private TestDataProvider testDataProvider;

    @PostConstruct
    public void init(){
        currentDischargeForm = testDataProvider.getTestDischargeForm();
    }


    public DischargeForm getCurrentDischargeForm() {
        return currentDischargeForm;
    }

    public void setCurrentDischargeForm(DischargeForm currentDischargeForm) {
        this.currentDischargeForm = currentDischargeForm;
    }
}
