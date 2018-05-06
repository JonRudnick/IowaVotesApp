package org.rudnick.iowavotes;

/**
 * Created by Jon on 1/3/2017.
 */

class Election {

    final private String mElectionName;
    final private String mElectionDate;
    final private String mElectionRegistrationDate;

    public Election(String electionName, String electionDate, String electionRegistrationDate) {
        mElectionName = electionName;
        mElectionDate = electionDate;
        mElectionRegistrationDate = electionRegistrationDate;
    }

    public String getElectionName() {
        return mElectionName;
    }

    public String getElectionDate() {
        return mElectionDate;
    }

    public String getElectionRegistrationDate() {
        return mElectionRegistrationDate;
    }

}
