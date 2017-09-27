
import java.util.Scanner;

/**
 * Реализация калькулятора. Ввод с консоли.
 * Поддерживает только операцию сложения(+).
 */
public class InteractRunner {
    private final Scanner scanner;
    /**
     * Encapsulates calculations
     */
    private Calculator calculator;

    /**
     * Parameters for calculations.
     */
    private Integer first;
    private Integer second;


    public static void main(String[] args) {
        InteractRunner interactRunner = new InteractRunner();
        interactRunner.startCalculate();
    }


    /**
     * Default constructor.
     */
    public InteractRunner() {
        super();
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }


    /**
     * Adds first to second parameters. Prints the result in console.
     */
    private void calculate() {
        calculator.add(first,second);
        System.out.println("Result = " + calculator.getResult());
        calculator.cleanResult();
    }

    /**
     * Input first and second parameters via console.
     */
    private void inputParameters() {
            System.out.println("Enter first arg:");
            this.first = Integer.valueOf(scanner.next());
            System.out.println("Enter second arg:");
            this.second = Integer.valueOf(scanner.next());
    }

    /**
     * Loops calculations until user print "yes"
     */
    private void startCalculate() {
        String exit = "no";
        while (!exit.equals("yes")) {
            inputParameters();
            calculate();
            System.out.println("Exit? yes/no");
            exit = scanner.next();
        }
        scanner.close();
    }
}
