package uk.nhs.scot.tayside.dto;

public class Medication {


    private String description;
    private String dose;
    private String instructions;
    private String duration;
    private String supply;
    private String otherSupply;
    private String dispensary;
    private String quantity;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {this.dose = dose; }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getOtherSupply() {
        return otherSupply;
    }

    public void setOtherSupply(String otherSupply) {
        this.otherSupply = otherSupply;
    }

    public String getDispensary() {
        return dispensary;
    }

    public void setDispensary(String dispensary) {
        this.dispensary = dispensary;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
