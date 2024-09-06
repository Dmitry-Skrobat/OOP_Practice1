package Numbers;

import java.util.Scanner;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Number NumberSum(Number value1,Number value2){
        return new Number(value1.getValue() + value2.getValue());
    }
    public Number NumberDiv(Number value1,int value2){
        return new Number(value1.getValue() / value2);
    }
    public Number NumberDif(Number value1,Number value2){
        return new Number(value1.getValue() - value2.getValue());
    }
    public Number NumberPow(Number value1,int value2){
        return new Number(Math.pow(value1.getValue(),value2));
    }
    public Number NumberSqrt(Number value1){return new Number (Math.sqrt(value1.getValue()));}
    public Number scannerNumber(){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return new Number(num);

    }
    public int comparisonNumber(Number value1,Number value2){
        return Double.compare(value1.getValue(), value2.getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
