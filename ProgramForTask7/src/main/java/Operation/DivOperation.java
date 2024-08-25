package Operation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class DivOperation extends Operation {


    public DivOperation(double a_value, double b_value) {
        super(a_value, b_value);
    }

    /**
     * реализация на основе абстрактного метода операции деления
     * @throws ArithmeticException - может сгенерироваться исключение
     */
    @Override
    public void performOperation() throws ArithmeticException {
        try {
            if (getB_value() == 0) {
                setResult(1.00/0);
                throw new ArithmeticException();
            } else{
            setResult(getA_value() / getB_value());
            setStringResult();
            }
        }
        catch(ArithmeticException e) {
            System.out.println("В школе учат, что делить на ноль нельзя!");
            setStringResult("'error'");
            e.printStackTrace();
        }
    }
}

