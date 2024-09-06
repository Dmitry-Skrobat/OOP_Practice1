package Numbers;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getValue(){
        return Math.sqrt(real*real+imaginary*imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary +"i";
    }
}
