package Calculation;
import Operation.Operation;
import Operation.SumOperation;
import Operation.SubOperation;
import Operation.MultiplyOperation;
import Operation.DivOperation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class Calculation {
    private double a; // переменная получает с консоли первое значение для бинарной операции
    private double b; // переменная получает с консоли второе значение для бинарной операции
    private String calcOperator;  // переменная получает с консоли символ выбранной пользователем бинарной операции
    private boolean calculateResult = false;
    private Operation operator;

    public Calculation() {
        calcOperator = "#";
    }

    /**
     * в методе производится выбор бинарной операции и расчет результата ее работы
     */
    public void calculateOperation() {
        boolean correctOperator = true;
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
                correctOperator = false;
        }

        if (correctOperator) {
            operator.performOperation();
            calculateResult = true;
        }
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setCalcOperator(String calcOperator) {
        this.calcOperator = calcOperator;
    }

    public boolean isCalculateResult() {
        return calculateResult;
    }

    public double getResult() {
        double return_result = 0;
        if (isCalculateResult()) {
            return_result = operator.getResult();
        }
        return return_result;
    }

    @Override
    public String toString() {
        String return_result = "";
        if (isCalculateResult()) {
            return_result = operator.toString();
        }
        return return_result;
    }
}