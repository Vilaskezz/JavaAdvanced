package Operation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public abstract class Operation {
    private double a_value; // переменная содержит первое значение для бинарной операции
    private double b_value; // переменная содержит второе значение для бинарной операции
    private double result; // результат расчета выбранной операции

    /**
     * конструктор класса
     * @param a_value - назначение переменно см. комментарии выше
     * @param b_value - назначение переменно см. комментарии выше
     */
    public Operation(double a_value, double b_value) {
        this.a_value = a_value;
        this.b_value = b_value;
    }

    public Operation(){};

    public double getA_value() {
        return a_value;
    }

    public double getB_value() {
        return b_value;
    }

    public void setResult(double result) {
        this.result = result;
    }

    /**
     * абстрактный метод подразумевает в дальнейшем реализацию 4х операций:
     * сложения, вычетания, умножения и деления
     */
    public abstract void performOperation();

    @Override
    public String toString() {
        return String.format("Результат расчета: %.4f", result) +"\n";
    }
}