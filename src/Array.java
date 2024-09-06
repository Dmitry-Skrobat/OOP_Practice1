import Numbers.Number;

public class Array {
    private Number[] elements;

    public Array(int size) {
        if (size<0) throw new IllegalArgumentException("The array size cannot be less than 0");
        this.elements = new Number[size];
        for(int i = 0; i<size;i++){
            elements[i] = new Number(0);
        }
    }

    public Array() {
        this.elements = new Number[10];
        for(int i = 0; i<10;i++){
            elements[i] = new Number(Math.round(Math.random()*10));
        }
    }

    public void input(){
        for(int i = 0;i<elements.length;i++){
            Number value = new Number(0);
            value = value.scannerNumber();
            elements[i] = value;
        }

    }

    public void resize(int newSize){
        Number[] numbers = new Number[newSize];
        for(int i = 0;i<newSize;i++){
            if(elements.length>i) {
                numbers[i] = elements[i];
            }
            else {
                numbers[i] = new Number(0);
            }
        }
        elements = numbers;
    }

    public void showArray(){
        for (Number element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void calculateMeanAndStandardDeviation(){
        int numberOfValues = elements.length;
        if(numberOfValues==0){
            System.out.println("The array is empty");
            return;
        }
        Number sum = new Number(0);
        for (Number element : elements) {
            sum = sum.NumberSum(sum,element);
        }
        Number result1 = sum.NumberDiv(sum,numberOfValues);
        System.out.println("The mean deviation is equal to " + result1);

        sum = new Number(0);
        Number difference = new Number(0);
        Number pow = new Number(0);
        for (Number element : elements) {
            difference = difference.NumberDif(element,result1);
            pow = pow.NumberPow(difference,2);
            sum = sum.NumberSum(sum,pow);
        }
        Number result2 = sum.NumberDiv(sum,elements.length-1);
        System.out.println("The standard deviation is equal to "+ result2.NumberSqrt(result2));
    }

    public void sortAscending(){
        for(int i = 0;i<elements.length-1;i++){
            boolean swapped = true;
            for(int j = 0; j<elements.length-1-i;j++){
                Number temp;
                if(elements[j].comparisonNumber(elements[j],elements[j+1]) == 1){
                    temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped){
                break;
            }
        }
    }

    public void sortDescending(){
        for(int i = 0;i<elements.length-1;i++){
            boolean swapped = true;
            for(int j = 0; j<elements.length-1-i;j++){
                Number temp;
                if(elements[j].comparisonNumber(elements[j],elements[j+1]) == -1){
                    temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped){
                break;
            }
        }
    }





}
