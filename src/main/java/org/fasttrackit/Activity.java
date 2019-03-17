package org.fasttrackit;

public class Activity {
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    private String activityName;

    public Activity(String activityName) {
        this.activityName = activityName;
    }
}
