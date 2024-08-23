import Calculation.Calculation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class ProgramForTask4 {
    /**
     * основной метод класса реализует вызов 3х основных методов класса Calculation калькулятора
     * @param args параметры командной строки, указанные при запуске программы
     */
    public static void main(String[] args) {
        Calculation calculator = new Calculation();
        calculator.initializeValues();
        calculator.calculateOperation();
        calculator.PrintResult();
    }
}
