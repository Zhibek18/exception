package kz.kakimzhanova.exception.report;

import kz.kakimzhanova.exception.calculator.CalculatorImpl;

public class Report {
    public void printReport(double [] doubles){
        for (double d : doubles){
            System.out.println(d);
        }

        CalculatorImpl calculator = new CalculatorImpl();

        System.out.println("sum: " + calculator.calculateSum(doubles));
        System.out.println("average: " + calculator.calculateAverage(doubles));
    }
}
