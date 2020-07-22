package uk.nhs.scot.tayside.dto;

import java.time.LocalDateTime;

public class SignOff {

    private String signOffUser;
    private LocalDateTime signOffDateTime;

    public String getSignOffUser() {
        return signOffUser;
    }

    public void setSignOffUser(String signOffUser) {
        this.signOffUser = signOffUser;
    }

    public LocalDateTime getSignOffDateTime() {
        return signOffDateTime;
    }

    public void setSignOffDateTime(LocalDateTime signOffDateTime) {
        this.signOffDateTime = signOffDateTime;
    }


}
