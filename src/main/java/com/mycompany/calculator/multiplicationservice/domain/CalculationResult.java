package com.mycompany.calculator.multiplicationservice.domain;

public class CalculationResult {
    private String resultStatus;

    private String resultValue;

    public CalculationResult(){}

    public CalculationResult(String resultStatus, String resultValue) {
        this.resultStatus = resultStatus;
        this.resultValue = resultValue;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }
}
