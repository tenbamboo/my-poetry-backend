package com.tenbamboo.bean;

public class PoetryDone {
    private String doneId;

    private String fileName;

    private String startTime;

    private String endTime;

    public String getDoneId() {
        return doneId;
    }

    public void setDoneId(String doneId) {
        this.doneId = doneId == null ? null : doneId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }
}