package uk.nhs.scot.tayside;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class MyBean {

    private Integer myMagicInt;

    @PostConstruct
    public void initialize() {
        this.myMagicInt = 150000;


    }

    public Integer getMyMagicInt() {
        return this.myMagicInt;
    }

    public void setMyMagicInt(Integer myMagicInt) {
        this.myMagicInt = myMagicInt;
    }


}
