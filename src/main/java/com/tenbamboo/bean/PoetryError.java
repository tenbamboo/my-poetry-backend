package com.tenbamboo.bean;

public class PoetryError {
    private String errorId;

    private String errorFileName;

    private String errorTitleName;

    private String errorMsg;

    private String isSolve;

    private String solveWay;

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId == null ? null : errorId.trim();
    }

    public String getErrorFileName() {
        return errorFileName;
    }

    public void setErrorFileName(String errorFileName) {
        this.errorFileName = errorFileName == null ? null : errorFileName.trim();
    }

    public String getErrorTitleName() {
        return errorTitleName;
    }

    public void setErrorTitleName(String errorTitleName) {
        this.errorTitleName = errorTitleName == null ? null : errorTitleName.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getIsSolve() {
        return isSolve;
    }

    public void setIsSolve(String isSolve) {
        this.isSolve = isSolve == null ? null : isSolve.trim();
    }

    public String getSolveWay() {
        return solveWay;
    }

    public void setSolveWay(String solveWay) {
        this.solveWay = solveWay == null ? null : solveWay.trim();
    }
}