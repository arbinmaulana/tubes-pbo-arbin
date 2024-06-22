package org.example.com.main.reporting;

import java.time.LocalDateTime;

public class Sanction {
    private String sanctionId;
    private String studentId;
    private String description;
    private LocalDateTime timestamp;

    public Sanction(String sanctionId, String studentId, String description) {
        this.sanctionId = sanctionId;
        this.studentId = studentId;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    public String getSanctionId() {
        return sanctionId;
    }

    public void setSanctionId(String sanctionId) {
        this.sanctionId = sanctionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Sanction ID: " + sanctionId + "\nStudent ID: " + studentId + "\nDescription: " + description + "\nTimestamp: " + timestamp;
    }
}
