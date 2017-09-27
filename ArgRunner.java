
import java.util.Scanner;

/**
 * Realize Calculator with user console input.
 */
public class ArgRunner {
    private String operation;
    private Scanner scanner;
    private double first;
    private double second;
    private Calculator calc = new Calculator();


    public static void main(String[] args) {
        new ArgRunner().go();
    }


    /**
     * Runs main logic.
     */
    private void go() {
        try (Scanner scnr = new Scanner(System.in)) {
            this.scanner = scnr;
            String exit = "n";
            while (!exit.equals("y")) {
                chooseOperation();
                doClearResult();
                execOperation();

                System.out.println("> Exit? y/n");
                exit = scanner.next();
            }
        }
    }

    /**
     * Executes defined operation.
     */
    private void execOperation() {
        switch (operation) {
            case "+" : {
                    if (calc.getResult() == 0) {
                        inputTwoArgs();
                        calc.add(first, second);
                    } else {
                        inputOneArg();
                        calc.add(first);
                    }
                    System.out.println("> Sum = " + calc.getResult());
                    break;}
            case "-" : {
                    if (calc.getResult() == 0) {
                        inputTwoArgs();
                        calc.subtract(first, second);
                    } else {
                        inputOneArg();
                        calc.subtract(first);
                    }
                    System.out.println("> Sub = " + calc.getResult());
                    break;}
            case "*" : {
                    if (calc.getResult() == 0) {
                        inputTwoArgs();
                        calc.multiply(first, second);
                    } else {
                        inputOneArg();
                        calc.multiply(first);
                    }
                    System.out.println("> Mult = " + calc.getResult());
                    break;}
            case "/" : {
                    if (calc.getResult() == 0) {
                        inputTwoArgs();
                        calc.divide(first, second);
                    } else {
                        inputOneArg();
                        calc.divide(first);
                    }
                    System.out.println("> Div = " + calc.getResult());
                    break;}
            default: {break;}
        }
    }


    /**
     * Asks user about clear result.
     */
    private void doClearResult() {
        if (calc.getResult() != 0) {
            System.out.println("> Clear result? y/n");
            if (scanner.next().equals("y"))  calc.cleanResult();
        }
    }


    private void inputTwoArgs() {
        System.out.println("> Enter first arg:");
        first = Double.valueOf(scanner.next());
        System.out.println("> Enter second arg:");
        second = Double.valueOf(scanner.next());
    }


    private void inputOneArg() {
        System.out.println("> Enter an arg:");
        first = Double.valueOf(scanner.next());
        if (operation.equals("*")) {
            second = 1;
        } else second = 0;
    }

    private void chooseOperation() {
        System.out.println("> Choose operation. Type +, -, * or /");
        operation = scanner.next();
    }

}
