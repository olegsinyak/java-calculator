
/**
 * Class realize calculator.
 */
public class Calculator {
    /**
     * Result of calculations.
     */
    private double result;


    /**
     * Sums arguments.
     * @param params arguments for summing.
     */
    public void add(double... params) {
        for (Double i : params) {
            this.result += i;
        }
    }


    /**
     * Multiplies arguments
     * @param params arguments for multiply.
     */
    public void multiply(double... params) {
        if (params.length > 1 && result == 0) {
            result = params[0];
            for (int i = 1; i < params.length; i++) {
                result *= params[i];
            }
        }else {
            for (Double i : params) {
                this.result *= i;
            }
        }
    }


    /**
     * Subtract arguments. If count of arguments more than one,
     * then subtract second from first.
     * <p>Else subtract first from result.
     * @param params arguments for subtracting.
     */
    public void subtract(double... params) {
        if (params.length > 1 && result==0) {
            result = params[0];
            for (int i = 1; i < params.length; i++) {
                result -= params[i];
            }
        } else {
            for (Double i : params) {
                this.result -= i;
            }
        }
    }


    /**
     * Divides on arguments. If count of arguments more than one,
     * then divide first argument by second.
     * <p>Else Divides result by first.
     * @param params arguments for divide.
     */
    public void divide(double... params) {
        if (params.length > 1 && result == 0) {
            result = params[0];
            for (int i = 1; i < params.length; i++) {
                if (params[i]!=0) {
                    result /= params[i];
                } else {
                    result = Double.MAX_VALUE;
                }
            }
        } else {
            for (Double i : params) {
                if (i!=0) {
                    result /= i;
                } else {
                    result = Double.MAX_VALUE;
                }
            }
        }
    }


    /**
     * Get result of calculations.
     * @return result
     */
    public double getResult() {
        return this.result;
    }


    /**
     *Clears result by setting to 0.
     */
    public void cleanResult() {
        this.result = 0;
    }
}
