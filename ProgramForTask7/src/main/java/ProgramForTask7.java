import Calculation.Calculation;

import java.util.Scanner;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class ProgramForTask7 {
    /**
     * основной метод класса реализует вызов 3х основных методов класса Calculation калькулятора
     * @param args параметры командной строки, указанные при запуске программы
     */
    public static void main(String[] args) {
        Calculation calculator = new Calculation();
        initializeValues(calculator);
        calculator.calculateOperation();
        printResult(calculator);
    }

    /**
     * метод инициализирует значения и вид бинароной операции
     */
    public static void initializeValues(Calculation calculator){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число (целое или десятичную дробь): ");
        calculator.setA(in.nextDouble());
        System.out.println("Введите второе число (целое или десятичную дробь): ");
        calculator.setB(in.nextDouble());
        System.out.println("Введите одно из действий миникалькулятора ‘+’, ‘-’, ‘*’ или ‘/’: ");
        calculator.setCalcOperator(in.next());
        in.close();
    }

    /**
     * метод производит вывод результата работы калькулятора в консоль
     */
    public static void printResult(Calculation calculator) {
        if(calculator.isCalculateResult()){
            System.out.println(calculator);
        }
        else {
            System.out.println("Вы что-то ввели некорректно!");
        }
    }
}
