package uk.nhs.scot.tayside.enumerator;

public enum PharmacyStatus {


    DISPENSE_REQUIRED_01(1, "Dispense required"),
    AWAITING_REVIEW_OF_SUPPLY_02(2, "Awaiting review of supply"),
    DISPENSE_NOT_REQUIRED_03(3, "Dispense not required"),
    DISPENSED_AWAITING_CHECK_04(4, "Dispense and awaiting check"),
    DISPENSED_AND_CHECKED_05(5, "Dispensed and checked");

    private String description;
    private int pharmacyStatusID;


    PharmacyStatus(int pharmacyStatusID, String description ) {
        this.description = description;
        this.pharmacyStatusID = pharmacyStatusID;
    }
}



