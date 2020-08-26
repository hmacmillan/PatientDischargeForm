package uk.nhs.scot.tayside.application;

import uk.nhs.scot.tayside.dto.MedicationSupply;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
@Named
public class ApplicationValues {


    private List<MedicationSupply> medicationSupplyList;

    private Map<Integer, MedicationSupply> medicationSupplyMap;

    // private List<SelectItem> cars;

    @PostConstruct
    public void init() {
        medicationSupplyList = new ArrayList<>();
        medicationSupplyList.add(new MedicationSupply(1, "Own Supply"));
        medicationSupplyList.add(new MedicationSupply(2, "Hospital Pharmacy"));
        medicationSupplyList.add(new MedicationSupply(3, "TTO"));
        medicationSupplyList.add(new MedicationSupply(4, "Compliance Device"));
        medicationSupplyList.add(new MedicationSupply(5, "Other"));


        medicationSupplyMap = new HashMap<>();

        medicationSupplyMap.put(1, new MedicationSupply(1, "Own Supply"));
        medicationSupplyMap.put(2, new MedicationSupply(2, "Hospital Pharmacy"));
        medicationSupplyMap.put(3, new MedicationSupply(3, "TTO"));
        medicationSupplyMap.put(4, new MedicationSupply(4, "Compliance Device"));
        medicationSupplyMap.put(5, new MedicationSupply(5, "Other"));

    }


    public List<MedicationSupply> getMedicationSupplyList() {
        return medicationSupplyList;
    }


    public Map<Integer, MedicationSupply> getMedicationSupplyMap() {
        return medicationSupplyMap;
    }
}
