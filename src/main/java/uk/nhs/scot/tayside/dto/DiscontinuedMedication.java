package uk.nhs.scot.tayside.dto;

public class DiscontinuedMedication {


    private String description;
    private String instructions;
    private String discontinueReason;
    private String permanency;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDiscontinueReason() {
        return discontinueReason;
    }

    public void setDiscontinueReason(String discontinueReason) {
        this.discontinueReason = discontinueReason;
    }

    public String getPermanency() {
        return permanency;
    }

    public void setPermanency(String permanency) {
        this.permanency = permanency;
    }
}
