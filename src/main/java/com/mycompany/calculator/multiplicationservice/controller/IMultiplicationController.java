package com.mycompany.calculator.multiplicationservice.controller;

import com.mycompany.calculator.multiplicationservice.domain.CalculationResult;

public interface IMultiplicationController {
    CalculationResult multiplicate(String firstNumber, String secondNumber);

}
