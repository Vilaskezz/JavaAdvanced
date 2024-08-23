package Operation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class MultiplyOperation extends Operation {

    public MultiplyOperation(double a_value, double b_value) {
        super(a_value, b_value);
    }

    /**
     * реализация на основе абстрактного метода операции умножения
     */
    @Override
    public void performOperation() {
        setResult(getA_value() * getB_value());
    }
}
