package com.mycompany.calculator.multiplicationservice.service;

import com.mycompany.calculator.multiplicationservice.domain.CalculationResult;

public interface IMultiplicationService {
    CalculationResult multiplicate(String firstNumber, String secondNumber);
}
