package uk.nhs.scot.tayside;

import uk.nhs.scot.tayside.enumerator.DocStatus;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("test");


        DocStatus docStatus = DocStatus.INITIAL_IN_PROGRESS_01;

        System.out.println(docStatus.getDescription());
        System.out.println(docStatus);

        DocStatus docStatus2 = DocStatus.valueOf("INITIAL_SO_DISPENSED_AWAITING_CHECK_05");


        System.out.println(docStatus2.getDescription());
        System.out.println(docStatus2);


    }
}
