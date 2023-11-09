package dz25.dz25.service;

import dz25.dz25.exceptions.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ServiceInterface {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("Делить на ноль нельзя, дружок");
        }
        return num1 / num2;
    }

    public int add(int i, int i1) {
        return 0;
    }

    public int subtract(int i, int i1) {
        return 0;
    }
}