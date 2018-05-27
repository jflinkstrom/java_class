/**
 * A simple example class to demonstrate Dependency Injection,
 * specifically dependency injection in a constructor
 */
public class dependencyInjection {
    /**
     * A double and double array used for simple math in methods
     */
    private double aNumber;
    private double[] bNumber;

    /**
     * ctor with variables injected
     * @param aNumber
     * @param bNumber
     */
    public dependencyInjection(double aNumber, double[] bNumber){
        this.aNumber = aNumber;
        this.bNumber = bNumber;
    }

    /**
     * @return aNumber multiplied by first element in bNumber
     */
    public double multipleNumber(){
        return aNumber * bNumber[0];
    }

    /**
     * adds all elements in array
     * @return sum plus aNumber
     */
    public double addDoubleArray() {
        double sum = 0.0;
        for (int i = 0; i < bNumber.length; i++) {
            sum = sum + bNumber[i];
        }
        return sum + aNumber;
    }
}