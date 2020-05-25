package com.jiayi.analysis.teamworkdata;

import java.io.Serializable;

public class User implements Serializable {

    private String emailStatus;
    private String projectCount;

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(String projectCount) {
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "emailStatus='" + emailStatus + '\'' +
                ", projectCount='" + projectCount + '\'' +
                '}';
    }
}
