import org.junit.Test;
import org.junit.Assert;
import Calculation.Calculation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class TestCalculation {
    Calculation calculator = new Calculation();

    /**
     * Метод проверяет доступные для чтения параметры класса после создания объекта класса
     */
    @Test
    public void initializeCalculationTest(){
        Assert.assertFalse("А должно быть false",  calculator.isCalculateResult());
   }

    /**
     * Метод проверяет доступные для чтения параметры класса после создания объекта класса
     */
    @Test
    public void getResultTest(){
        Assert.assertEquals("А должно быть 0", 0,  calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "", calculator.toString());
    }

    /**
     * Метод проверяет корректность операции сложения
     */
    @Test
    public void sumOperationtest() {
        double a, b;
        String operator = "+";
        calculator.setCalcOperator(operator);

        // Проверка операции сложения целых чисел 1 + 2 = 3
        a = 1;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 3", 3, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 3,0000", calculator.toString());

        // Проверка операции сложения дробных чисел 1.55569 + 2.13233 = 3.68802
        a = 1.55569;
        b = 2.13233;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 3.68802", 3.68802, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 3,6880", calculator.toString());


        // Проверка операции сложения отрицательного и положительного числа
        a = -1.55562;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0.44438", 0.44438, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,4444", calculator.toString());

        // Проверка операции сложения отрицательных чисел
        a = -1.55562;
        b = -2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -3.55562", -3.55562, calculator.getResult(), 0.000000000000002);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -3,5556", calculator.toString());
    }

    /**
     * Метод проверяет корректность операции вычитания
     */
    @Test
    public void subOperationTest() {
        double a, b;
        String operator = "-";
        calculator.setCalcOperator(operator);

        // Проверка операции вычитания целых чисел 1 - 2= -1
        a = 1;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -1,0000", -1, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -1,0000", calculator.toString());

        // Проверка операции вычитания дробных чисел 1.55569 - 2.13233 = 3.68802
        a = 1.55569;
        b = 2.13233;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -0,57664", -0.57664, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -0,5766", calculator.toString());


        // Проверка операции вычитания отрицательного и положительного числа
        a = -1.55562;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -3,55562", -3.55562, calculator.getResult(), 0.000000000000002);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -3,5556", calculator.toString());

        // Проверка операции вычитания отрицательных чисел
        a = -1.55562;
        b = -2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0,44438", 0.44438, calculator.getResult(), 0.000000000000002);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,4444", calculator.toString());

    }

    /**
     * Метод проверяет корректность операции умножения
     */
    @Test
    public void multiplyOperationTest() {
        double a, b;
        String operator = "*";
        calculator.setCalcOperator(operator);

        // Проверка операции умножения целых чисел 1 * 2= -1
        a = 1;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 2,0000", 2, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 2,0000", calculator.toString());

        // Проверка операции умножения больших чисел 1987543.4358 * 2239944.23234324= -1
        a = 1987543.4358;
        b = 2239944.23234324;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 4,451986455551877E12", 4451986455551.8770, calculator.getResult(), 0.00001);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 4451986455551,8770", calculator.toString());


        // Проверка операции умножения дробных чисел 1.55569 * 2.13233 = 3.3172444577
        a = 1.55569;
        b = 2.13233;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 3,3172444577", 3.3172444577, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 3,3172", calculator.toString());


        // Проверка операции умножения отрицательного и положительного числа
        a = -1.55562;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -3,11124", -3.11124, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -3,1112", calculator.toString());

        // Проверка операции умножения отрицательных чисел
        a = -1.55562;
        b = -2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 3,11124", 3.11124, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 3,1112", calculator.toString());

        // Проверка операции умножения на 0
        a = -1;
        b = 0;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0", 0, calculator.getResult(), 0);
        // странное поведение String.format("%.4f", result):
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -0,0000", calculator.toString());
    }

    /**
     * Метод проверяет корректность операции деления
     */
    @Test
    public void divOperationTest() {
        double a, b;
        String operator = "/";
        calculator.setCalcOperator(operator);

        // Проверка операции деления целых чисел 1 / 2 = 0.5
        a = 1;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0,5000", 0.5, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,5000", calculator.toString());

        // Проверка операции деления больших чисел 1987543.4358 / 2239944.23234324 = 0.8873182676163327
        a = 1987543.4358;
        b = 2239944.23234324;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0,8873182676163327", 0.8873182676163327, calculator.getResult(), 0.00001);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,8873", calculator.toString());


        // Проверка операции деления дробных чисел 1.55569 / 2.13233 = 0.7295728147144204
        a = 1.55569;
        b = 2.13233;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0,7295728147144204", 0.7295728147144204, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,7296", calculator.toString());


        // Проверка операции деления отрицательного и положительного числа
        a = -1.55562;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть -0,77781", -0.77781, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: -0,7778", calculator.toString());

        // Проверка операции деления отрицательных чисел
        a = -1.55562;
        b = -2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0,77781", 0.77781, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 0,7778", calculator.toString());

        // Проверка операции деления на 0
        a = 3.000;
        b = 0;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть Infinity", "Infinity", Double.toString(calculator.getResult()));
        Assert.assertEquals("Некорректно сфомрмировалась строка", "Результат расчета: 'error'", calculator.toString());
    }

    @Test
    public void wrongOperationTest() {
        double a, b;
        String operator = "#";
        calculator.setCalcOperator(operator);

        // Проверка ошибки выбора оператора, т.е. выбран ни один из 4х операторов: "+", "-", "*", "/"
        a = 1;
        b = 2;
        calculator.setA(a);
        calculator.setB(b);
        calculator.calculateOperation();
        Assert.assertEquals("А должно быть 0", 0, calculator.getResult(), 0);
        Assert.assertEquals("Некорректно сфомрмировалась строка", "", calculator.toString());
    }
}
