package com.mycompany.calculator.multiplicationservice.service;

import com.mycompany.calculator.multiplicationservice.domain.CalculationResult;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService implements IMultiplicationService{

    @Override
    public CalculationResult multiplicate(String firstNumber, String secondNumber) {
        CalculationResult calculationResult = new CalculationResult();
        try {
            Integer firstValue = Integer.parseInt(firstNumber);
            Integer secondValue = Integer.parseInt(secondNumber);
            calculationResult.setResultValue("" + firstValue*secondValue);
            calculationResult.setResultStatus("SUCCESS");
        } catch (NumberFormatException e){
            calculationResult.setResultStatus("FAIL: " + e.getMessage());
        }
        return calculationResult;
    }
}
