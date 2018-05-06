package org.rudnick.iowavotes;

/**
 * Created by Jon on 1/3/2017.
 */

class Step {

    final private String mStepTitle;
    final private String mStepDescription;
    private String mStepLink;

    public Step(String stepTitle, String stepDescription, String stepLink) {
        mStepTitle = stepTitle;
        mStepDescription = stepDescription;
        mStepLink = stepLink;
    }

    public Step(String stepTitle, String stepDescription) {
        mStepTitle = stepTitle;
        mStepDescription = stepDescription;
    }

    public String getStepTitle() {
        return mStepTitle;
    }

    public String getStepDescription() {
        return mStepDescription;
    }

    public String getStepLink() {
        return mStepLink;
    }

}
