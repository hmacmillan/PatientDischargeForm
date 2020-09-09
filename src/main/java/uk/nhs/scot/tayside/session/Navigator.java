package uk.nhs.scot.tayside.session;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class Navigator implements Serializable {


    private String mainPage = "DischargeForm.xhtml";


    public String getMainPage() {
        return mainPage;
    }

    public void setMainPage(String mainPage) {
        this.mainPage = mainPage;
    }


    public void changeMainPage(String newPage) {
        this.mainPage = newPage;
    }


}
