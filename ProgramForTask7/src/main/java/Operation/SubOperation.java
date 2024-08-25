package Operation;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class SubOperation extends Operation {

    public SubOperation(double a_value, double b_value) {
        super(a_value, b_value);
    }

    /**
     * реализация на основе абстрактного метода операции вычитания
     */
    @Override
    public void performOperation() {
        setResult(getA_value() - getB_value());
        setStringResult();
    }
}