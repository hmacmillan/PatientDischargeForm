package uk.nhs.scot.tayside.dal;

import uk.nhs.scot.tayside.dto.Patient;

import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named
public class TrainingDB implements Serializable {


    @Resource(lookup = "java:/TrainingDatabaseDS")
    private DataSource trainingDBdataSource;


    public void testDB() {
        try {
            System.out.println("test in TrainingDB:" + getAllPatients());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public List<Patient> getAllPatients() throws SQLException {

        List<Patient> patientList = new ArrayList<>();

        try (Connection connection = trainingDBdataSource.getConnection()) {

            String sql = "select chi,dob,forename,gender,postcode,start_of_address,surname FROM patients";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Patient patient = new Patient();

                patient.setChinumber(resultSet.getString("CHI"));
                patient.setAddress(resultSet.getString("START_OF_ADDRESS"));
                patient.setForename(resultSet.getString("FORENAME"));
                patient.setSurname(resultSet.getString("SURNAME"));
                patient.setGender(resultSet.getString("GENDER"));

                patient.setDateOfBirth(resultSet.getDate("DOB").toLocalDate());


                patientList.add(patient);

            }


        }


        return patientList;

    }


}
