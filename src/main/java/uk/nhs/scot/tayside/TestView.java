package uk.nhs.scot.tayside;

import uk.nhs.scot.tayside.dal.TrainingDB;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class TestView implements Serializable {


    @Inject
    private TrainingDB trainingDB;


    public void doTest() {
        System.out.println("test output in TestView ");

        trainingDB.testDB();
    }

}
