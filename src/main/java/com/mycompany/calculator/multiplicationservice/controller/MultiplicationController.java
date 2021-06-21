package com.mycompany.calculator.multiplicationservice.controller;

import com.mycompany.calculator.multiplicationservice.domain.CalculationResult;
import com.mycompany.calculator.multiplicationservice.service.IMultiplicationService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/multiplication")
public class MultiplicationController implements IMultiplicationController {

  private final IMultiplicationService multiplicationService;

  public MultiplicationController(IMultiplicationService multiplicationService) {
    this.multiplicationService = multiplicationService;
  }

  @Override
  @GetMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
  public CalculationResult multiplicate(
      @RequestParam(value = "one") String firstNumber,
      @RequestParam(value = "two") String secondNumber) {
    return multiplicationService.multiplicate(firstNumber, secondNumber);
  }
}
