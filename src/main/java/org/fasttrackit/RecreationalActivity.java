package org.fasttrackit;

public class RecreationalActivity {

    private String activityName = "walk";

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public RecreationalActivity(String activityName) {
        this.activityName = activityName;
    }
}
