package org.example.com.main.reporting;

import java.time.LocalDate;

public class Report {
    private String reportId;
    private String content;
    private LocalDate date;

    public Report(String reportId, String content) {
        this.reportId = reportId;
        this.content = content;
        this.date = LocalDate.now();
    }

    // Getter dan Setter

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
