package kz.kakimzhanova.exception.calculator;

public class CalculatorImpl implements Calculator {
    public double calculateAverage(double[] floats) {

        return calculateSum(floats) / floats.length;
    }

    public double calculateSum(double[] floats) {
        double sum = 0;

        for (double elem : floats){
            sum += elem;
        }
        return sum;
    }
}
