package uk.nhs.scot.tayside.dto;

public class MedicationSupply {

    private int medicationSupplyID;

    private String description;

    public MedicationSupply(int medicationSupplyID, String description) {
        this.medicationSupplyID = medicationSupplyID;
        this.description = description;
    }

    public MedicationSupply() {
    }

    public int getMedicationSupplyID() {
        return medicationSupplyID;
    }

    public void setMedicationSupplyID(int medicationSupplyID) {
        this.medicationSupplyID = medicationSupplyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
