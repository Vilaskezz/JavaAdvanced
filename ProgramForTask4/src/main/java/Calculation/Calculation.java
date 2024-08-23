package Calculation;
import Operation.Operation;
import Operation.SumOperation;
import Operation.SubOperation;
import Operation.MultiplyOperation;
import Operation.DivOperation;
import java.util.Scanner;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class Calculation {
    private double a; // переменная получает с консоли первое значение для бинарной операции
    private double b; // переменная получает с консоли второе значение для бинарной операции
    private String calcOperator;  // переменная получает с консоли символ выбранной пользователем бинарной операции
    private boolean calculateResult = true;
    private Operation operator;

    public Calculation(){}

    /**
     * метод инициализирует значения и вид бинароной операции
     */
    public void initializeValues(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число (целое или десятичную дробь): ");
        a = in.nextDouble();
        System.out.println("Введите второе число (целое или десятичную дробь): ");
        b = in.nextDouble();
        System.out.println("Введите одно из действий миникалькулятора ‘+’, ‘-’, ‘*’ или ‘/’: ");
        calcOperator = in.next();
        in.close();
    }

    /**
     * в методе производится выбор бинарной операции и расчет результата ее работы
     */
    public void calculateOperation(){

        switch (calcOperator) {
            case "+": // действие при вводе в коммандной строке символа '+'
                operator = new SumOperation(a, b);
                break;
            case "-": // действие при вводе в коммандной строке символа '-'
                operator = new SubOperation(a, b);
                break;
            case "*": // действие при вводе в коммандной строке символа '*'
                operator = new MultiplyOperation(a, b);
                break;
            case "/": // действие при вводе в коммандной строке символа '/'
                operator = new DivOperation(a, b);
                break;
            default:
                calculateResult = false;
        }

        if(calculateResult) {
            operator.performOperation();
        }
    }

    /**
     * метод производит вывод результата работы калькулятора в консоль
     */
    public void PrintResult() {
        if(calculateResult){
            System.out.println(operator.toString());
        }
        else {
            System.out.println("Вы что-то ввели некорректно!");
        }
    }
}