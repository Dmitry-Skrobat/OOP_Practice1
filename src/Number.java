import java.util.Scanner;

public class Number {
    private double value;

    public Number() {
        this.value = 0;
    }

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }


    public Number numberSum(Number value1,Number value2){
        return new Number(value1.getValue() + value2.getValue());
    }
    public Number numberDiv(Number value1,int value2){
        return new Number(value1.getValue() / value2);
    }
    public Number numberDif(Number value1,Number value2){
        return new Number(value1.getValue() - value2.getValue());
    }
    public Number numberSquare(Number value1){
        return new Number(Math.pow(value1.getValue(),2));
    }
    public Number numberSqrt(Number value1){return new Number (Math.sqrt(value1.getValue()));}
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
