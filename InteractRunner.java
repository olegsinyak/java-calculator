import java.util.Scanner;

/**
* Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Calculator calculator = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg:");
                String first = scanner.next();
                
                System.out.println("Enter second arg:");
                String second = scanner.next();
                
                calculator.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result = " + calculator.getResult());
                
                calculator.cleanResult();
                System.out.println("Exit? yes/no");
                exit = scanner.next();
            }
        } finally {
            scanner.close();
        }
    }
}
