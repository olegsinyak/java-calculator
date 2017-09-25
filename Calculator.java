/**
 * Класс реализует калькулятор
 */
public class Calculator {
    /**
     * Результат вычислений
     */
    private int result;

    /**
     * Суммирует аргументы.
     * @param params аргументы суммироания.
     */
    public void add(int... params) {
        for (int i : params) {
            this.result += i;
        }
    }

    /**
     * Получить результат.
     * @return результат вычисления
     */
    public int getResult() {
        return this.result;
    }

    /**
     *Очитить результат.
     */
    public void cleanResult() {
        this.result = 0;
    }
}